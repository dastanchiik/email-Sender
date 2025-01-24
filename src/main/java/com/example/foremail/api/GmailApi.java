package com.example.foremail.api;

import com.example.foremail.gmail.GmailSender;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/email")
@RequiredArgsConstructor
@RestController
public class GmailApi {
    private final GmailSender sender;

    @GetMapping("/send")
    public String sendEmail(String email) {
        sender.emailSender(email);
        return "successfully sent ✅";
    }
}
