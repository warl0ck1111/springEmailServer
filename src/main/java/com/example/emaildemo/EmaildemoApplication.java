package com.example.emaildemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
@Slf4j
@SpringBootApplication
public class EmaildemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmaildemoApplication.class, args);
		log.info("\n\n*********************** BACKEND SERVICE STATED ***********************");

	}

	@Autowired private SendingEmailService sendingEmailService;

//	@Bean
//	public CommandLineRunner myCommandLineRunner() {
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				// Your code to be executed on application startup goes here
//				System.out.println("My CommandLineRunner has been executed.");
//				String from = "bashirokala@gmail.com";
//				String to = "bashirokala@hotmail.com";
//
//
//				sendingEmailService.sendEmail(new MailModel(from,to,"emailName", "content","", null));
//			}
//		};
//	}

}
