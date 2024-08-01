package com.snapchat.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.snapchat.entity.snapchatuser;

public class SnapchatDAO implements SnapchatDAOInterface {
	
	private static snapchatuser suser[];
	static {
		suser=new snapchatuser[10];
	}

	public int createProfileDAO(snapchatuser su)  {
		
//		for(int i=0;i<suser.length;i++) {
//			if(suser[i]==null) {
//				suser[i]=su;
//				break;
//			}
//		}
//		if(suser.length>0) {
//			return 1;
//		}
//		else {
//			return 0; 
//		}
		try {
		//step 1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create database connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
		
		//Step 3 create dynamic query
		PreparedStatement ps=con.prepareStatement("insert into snapchatuser values(?,?,?,?)");
		// "?" is known as place holder for the value
		//how to replace place holder(?) with value?
		
		ps.setString(1, su.getName());
		ps.setString(2, su.getPassword());
		ps.setString(3, su.getEmail());
		ps.setString(4, su.getAddress());
		
		//step 4 execute query	
		//for insert, delete and update we will use executeUpdate() method.
		//executeUpdate() method return type will be int, it will indicate number of rows affected by query
		//for select query we will use executeQuery() method
		//executeQuery() method return type will be ResultSet
		
		 int x=ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
