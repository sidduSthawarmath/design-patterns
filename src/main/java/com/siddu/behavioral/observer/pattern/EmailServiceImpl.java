package com.siddu.behavioral.observer.pattern;

public class EmailServiceImpl implements EmailService {

	public String emailTrigger(String fromUser, String password, String body, String toUser) {
		
	/*	System.out.println("\n\nFromUser: " + fromUser);
		System.out.println("password: " + password);

		System.out.println("To User: " + toUser);

		System.out.println("Message: " + body);*/
		
		System.out.println("Email sending to "+toUser+"...");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//System.out.println("Email sent successfully");

		return "Email sent successfully to "+toUser;
	}

}
