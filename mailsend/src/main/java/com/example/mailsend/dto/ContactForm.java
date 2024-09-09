package com.example.mailsend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactForm {
    private String name;
    private String email;
    private String phone;
    private String topic;
    private String message;
    private String subject;
}
