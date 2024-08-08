package com.snapchat.DAO;

import java.util.List;

import com.snapchat.entity.snapchatuser;

public interface SnapchatDAOInterface {

	int createProfileDAO(snapchatuser su) ;

	snapchatuser viewProfileDAO(snapchatuser su);

	List<snapchatuser> viewallProfileController();
	

	List<snapchatuser> searchProfileController(String name);

	

	int editProfileDAO(snapchatuser su);

}
