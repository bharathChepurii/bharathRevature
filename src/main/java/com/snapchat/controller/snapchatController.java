package com.snapchat.controller;

import java.util.Scanner;

import com.snapchat.entity.snapchatuser;
import com.snapchat.exception.ProfileNotFoundException;
import com.snapchat.service.snapchatService;
import com.snapchat.service.snapchatServiceInterface;

public class snapchatController implements snapchatControllerInterface {

	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter name");
        String name=sc.next();
        
        System.out.println("Enter password");
        String password=sc.next();
        
        System.out.println("Enter email");
        String email=sc.next();
        
        System.out.println("Enter Address");
        String address=sc.next();
        
        snapchatuser su=new snapchatuser();
        su.setName(name);
        su.setPassword(password);
        su.setEmail(email);
        su.setAddress(address);
        
        
        snapchatServiceInterface si=new snapchatService();
        int i=si.createProfileSerive(su);
        
        if(i>0) {
        	System.out.println("Profile Created");
        }
        else {
        	System.out.println("Profile rejected");
        }
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter email to view profile");
	    String email=sc.next();
	    
	    snapchatuser su=new snapchatuser();
	    su.setEmail(email);
	    
	    snapchatServiceInterface si=new snapchatService();
	    snapchatuser ss=si.viewProfileService(su);
	    
	    try {
	    if(ss!=null) {
	    	System.out.println("Your profile is ");
	    	System.out.println("Name is -->"+ss.getName());
	    	System.out.println("Password is -->"+ss.getPassword());	
	    	System.out.println("Email is -->"+ss.getEmail());
	    	System.out.println("Address is -->"+ss.getAddress());
	    	
	    	
	    }
	    else {
	    	throw new ProfileNotFoundException("Profile Not Found for given mail id "+email);
	    }
	}
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	}
	    

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfilrController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewallProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}
