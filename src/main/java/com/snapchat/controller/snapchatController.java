package com.snapchat.controller;

import java.util.List;
import java.util.Scanner;

import com.snapchat.entity.snapchatuser;
import com.snapchat.exception.ProfileNotFoundException;
import com.snapchat.service.snapchatService;
import com.snapchat.service.snapchatServiceInterface;

public class snapchatController implements snapchatControllerInterface {
    
	snapchatServiceInterface si=new snapchatService();
	
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
	public void viewallProfileController(){
		  
		List<snapchatuser> ll= si.viewallProfileController();
		
		for(snapchatuser jk:ll) {
			System.out.println("*********************");
			System.out.println("Name is -->"+jk.getName());
	    	System.out.println("Password is -->"+jk.getPassword());	
	    	System.out.println("Email is -->"+jk.getEmail());
	    	System.out.println("Address is -->"+jk.getAddress());
	    	
		}
		
	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name to search profile");
	    String name=sc.next();
		List<snapchatuser> sp=si.searchProfileController(name);
		
		for(snapchatuser jk:sp) {
			System.out.println("*********************");
			System.out.println("Name is -->"+jk.getName());
	    	System.out.println("Password is -->"+jk.getPassword());	
	    	System.out.println("Email is -->"+jk.getEmail());
	    	System.out.println("Address is -->"+jk.getAddress());
	    	
		}
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}


}
