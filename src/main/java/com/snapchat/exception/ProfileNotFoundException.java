package com.snapchat.exception;

public class ProfileNotFoundException extends Exception {
     String message;
	
	public ProfileNotFoundException(String message){
		this.message=message;
	}
	
	public String toString() {
		return "Yes i am exception "+message;
	}
}
