 package com.snapchat.view;

import java.util.Scanner;

import com.snapchat.controller.snapchatController;
import com.snapchat.controller.snapchatControllerInterface;

public class snapchatView {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String ss="y";
		while(ss.equals("y")) {
		System.out.println("***********Main Menu*********");
	       System.out.println("press 1 to create ptofile");
	       System.out.println("press 2 to view profile");
	       System.out.println("press 3 to view all profile");
	       System.out.println("press 4 to Search profile");
	       System.out.println("press 5 to edit profile");
	       System.out.println("press 6 to delete profile ");
	       System.out.println("press 7 to login profile");
	       
	       Scanner sc=new Scanner(System.in);
	       int v=sc.nextInt();
	       
	       snapchatControllerInterface sci=new snapchatController();
	       
	       switch(v) {
	       case 1:
	    	   sci.createProfileController();
	    	   break;
	       case 2:
	    	   sci.viewProfileController();
	    	   break;
	       case 3:
	    	   sci.viewallProfileController();
	    	   break;
	       case 4:
	    	   sci.searchProfileController();
	    	   break;
	       case 5:
	    	   sci.editProfileController();
	       
	       }
	       System.out.println("Press y to Continue");
	       ss=sc.next();
	    		   
		}
	      
	}

}
