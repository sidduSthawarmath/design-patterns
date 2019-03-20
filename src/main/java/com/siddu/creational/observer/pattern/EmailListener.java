package com.siddu.creational.observer.pattern;

public class EmailListener {

	EmailService emailService = null;

	public EmailListener(EmailService emailService) {
		this.emailService = emailService;
	}

	public void sendEmail(final String toUsername, final String body) {
		new Thread(new Runnable() {
			public void run() {
				String ack = emailService.emailTrigger("siddumath@gmail.com", "siddu#098", body, toUsername);
				System.out.println(ack);
			}
		}).start();
	}

}
