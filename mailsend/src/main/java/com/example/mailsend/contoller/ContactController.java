package com.example.mailsend.contoller;

import com.example.mailsend.EmailService;
import com.example.mailsend.dto.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ContactController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
//    public String sendmail(@RequestBody ContactForm contactForm){
//        emailService.sendMail(contactForm.getTo(), contactForm.getSubject(), contactForm.getBody());
//        return "Email sent successfully";
//    }

    public String sendEmail(@RequestBody ContactForm contactForm) {
        String body = "Name: " + contactForm.getName() + "\n" +
                "Email: " + contactForm.getEmail() + "\n" +
                "Phone: " + contactForm.getPhone() + "\n" +
                "Topic: " + contactForm.getTopic() + "\n" +
                "Message: " + contactForm.getMessage();
        emailService.sendMail("recipient@example.com", contactForm.getSubject(), body);
        return "Email sent successfully";
    }
}
