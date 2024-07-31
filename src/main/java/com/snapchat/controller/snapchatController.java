package com.snapchat.controller;

import java.util.Scanner;

import com.snapchat.entity.snapchatuser;
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
