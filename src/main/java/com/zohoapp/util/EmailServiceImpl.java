package com.zohoapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private MailSender mailSender;
	
	
	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(msg);
		
		mailSender.send(mailMessage);

	}

}
