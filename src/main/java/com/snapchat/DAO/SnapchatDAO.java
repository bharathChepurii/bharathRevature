package com.snapchat.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.snapchat.entity.snapchatuser;

public class SnapchatDAO implements SnapchatDAOInterface {
	
	private static snapchatuser suser[];
	static {
		suser=new snapchatuser[10];
	}

	public int createProfileDAO(snapchatuser su)  {
		

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
		 return x;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public snapchatuser viewProfileDAO(snapchatuser su) {
		snapchatuser suser=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai","root","root");
			PreparedStatement ps=con.prepareStatement("select * from snapchatuser where email=?");
			ps.setString(1, su.getEmail());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				suser=new snapchatuser();
				suser.setName(n);
				suser.setPassword(p);
				suser.setEmail(e);
				suser.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return suser;
	}
	
	

}
