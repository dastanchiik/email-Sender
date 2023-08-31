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
    public void init(){
            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            try {
                helper.setTo("dosyafree32@gmail.com");
                helper.setSubject("Тема письма");
                helper.setText("Привет, это тестовое письмо!");
            } catch (Exception e) {
                e.printStackTrace();
            }

            sender.send(message);
    }
}
