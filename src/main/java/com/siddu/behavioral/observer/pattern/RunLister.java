package com.siddu.behavioral.observer.pattern;

public class RunLister {
	public static void main(String[] args) {

		EmailServiceImpl messageServiceImpl=new EmailServiceImpl();
		EmailListener emailService=new EmailListener(messageServiceImpl);
			
		emailService.sendEmail("ganesh@gmail.com", "Hi Ganesh");
		
		emailService.sendEmail("Ramesh@gmail.com", "Hi Ramesh");
		
		emailService.sendEmail("Ram@gmail.com", "Hi Ram");
		
		emailService.sendEmail("Raghav@gmail.com", "Hi Raghav");

		System.out.println("Email sending completed....");
	
	
	}
}
