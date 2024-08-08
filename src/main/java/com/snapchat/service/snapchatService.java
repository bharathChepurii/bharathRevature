package com.snapchat.service;

import java.util.List;

import com.snapchat.DAO.SnapchatDAO;
import com.snapchat.DAO.SnapchatDAOInterface;
import com.snapchat.entity.snapchatuser;

public class snapchatService implements snapchatServiceInterface {
	
	SnapchatDAOInterface sd=new SnapchatDAO();

	public int createProfileSerive(snapchatuser su) {
		return sd.createProfileDAO(su);
	}

	@Override
	public snapchatuser viewProfileService(snapchatuser su) {
		return sd.viewProfileDAO(su);
		
	}

	@Override
	public List<snapchatuser> viewallProfileController() {
		
		return sd.viewallProfileController();
	}

	@Override
	public List<snapchatuser> searchProfileController(String name) {
		
		
		return sd.searchProfileController(name);
	}

	@Override
	public int editProfileService(snapchatuser su) {
		SnapchatDAOInterface ld=new SnapchatDAO();
		return ld.editProfileDAO(su); 
	}


	
}
