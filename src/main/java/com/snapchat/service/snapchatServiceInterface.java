package com.snapchat.service;

import java.util.List;

import com.snapchat.entity.snapchatuser;

public interface snapchatServiceInterface {


	int createProfileSerive(snapchatuser su) ;

	snapchatuser viewProfileService(snapchatuser su);

	List<snapchatuser> viewallProfileController();


	List<snapchatuser> searchProfileController(String name);


	int editProfileService(snapchatuser ll);

	

}
