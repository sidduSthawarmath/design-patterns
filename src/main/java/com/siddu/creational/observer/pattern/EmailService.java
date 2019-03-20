package com.siddu.creational.observer.pattern;

public interface EmailService {
	public String emailTrigger(String fromUser, String password, String body, String toUser);
}
