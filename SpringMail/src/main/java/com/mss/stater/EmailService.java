package com.mss.stater;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

@Autowired
JavaMailSender javamailsender;


public String sendEmail() {
SimpleMailMessage message = new SimpleMailMessage();

message.setFrom("sasi@miraclesoft.com");
message.setTo("sasi@miraclesoft.com");
message.setSubject("SprinBoot");
message.setText("spring boot mail ");

javamailsender.send(message);

return "Mail sent successfully";
}


}

