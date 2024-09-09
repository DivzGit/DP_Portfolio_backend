package com.example.mailsend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

@SpringBootApplication
@Async
public class MailsendApplication {

	private static EmailService emailService;

    public MailsendApplication(EmailService emailService) {
        this.emailService = emailService;
    }

    public static void main(String[] args) {

		SpringApplication.run(MailsendApplication.class, args);
		System.out.println("app run.....mail send");
//		emailService.sendMail("divyamailz19999@gmail.com","email from java spring boot","hi there, this is java spring boot");
	}

}
