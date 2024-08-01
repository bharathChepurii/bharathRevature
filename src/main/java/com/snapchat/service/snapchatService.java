package com.snapchat.service;

import com.snapchat.DAO.SnapchatDAO;
import com.snapchat.DAO.SnapchatDAOInterface;
import com.snapchat.entity.snapchatuser;

public class snapchatService implements snapchatServiceInterface {

	public int createProfileSerive(snapchatuser su) {
		
		SnapchatDAOInterface sd=new SnapchatDAO();
		
		return sd.createProfileDAO(su);
	}

	
}
