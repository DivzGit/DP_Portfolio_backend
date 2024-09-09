package com.example.mailsend;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Async
    public void sendMail(String to, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            System.out.println("mail");
            message.setTo(to);
            message.setFrom("divmailz19999@gmail.com");
            message.setSubject(subject);
            message.setText(body);

            mailSender.send(message);
            System.out.println("Mail sent successfully");
        } catch (Exception e) {
            System.err.println("Error sending mail: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

