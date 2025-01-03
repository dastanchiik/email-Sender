package com.example.foremail.gmail;

import lombok.RequiredArgsConstructor;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.internet.MimeMessage;

@RequiredArgsConstructor
@Service
public class GmailSender {
    private final JavaMailSender sender;
    public void emailSender(String email){
            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            try {
                helper.setTo(email);
                helper.setSubject("Theme for letter");
                helper.setText("Hi bro, this just test!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            sender.send(message);
    }
}
