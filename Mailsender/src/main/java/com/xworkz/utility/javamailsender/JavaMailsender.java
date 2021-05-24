package com.xworkz.utility.javamailsender;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailsender {
	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("motgiprerana@gmail.com");
		mailSenderImpl.setPassword("");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs = {""};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("motgiprerana@gmail.com");
		message.setTo("motgiprerana@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Demo Mail Sender");
		message.setText("Hello Everyone \n I am Prerana M \n");
		
		mailSenderImpl.send(message);
	}
}
