package com.snapchat.util;

import java.util.Comparator;

import com.snapchat.entity.snapchatuser;

public class SortUserByEmail implements Comparator<snapchatuser> {

	@Override
	public int compare(snapchatuser o1, snapchatuser o2) {
		// TODO Auto-generated method stub
		return  o1.getEmail().compareTo(o2.getEmail());
	}

}
