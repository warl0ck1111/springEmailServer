package com.example.emaildemo;

import freemarker.template.TemplateException;
import jakarta.mail.MessagingException;

import java.io.IOException;

public interface SendingEmailService {
    void sendEmail(MailModel mailModel) throws MessagingException, IOException, TemplateException;

}
