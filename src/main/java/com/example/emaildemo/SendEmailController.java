package com.example.emaildemo;


import freemarker.template.TemplateException;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(
        origins = "*",
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}
)
@RestController
@RequestMapping("/sendmail")
public class SendEmailController {

    @Autowired
    private SendingEmailService sendingEmailService;

    @PostMapping
    public ResponseEntity<?> restPostLoanRequest(@RequestBody MailModel mailModel) {

        try {
            sendingEmailService.sendEmail(mailModel);
            return ResponseEntity.ok().body(mailModel.toString());
        } catch (MessagingException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        } catch (TemplateException e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(e.getMessage());
        }


    }
}
