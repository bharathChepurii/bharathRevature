package com.snapchat.util;

import java.util.Comparator;

import com.snapchat.entity.snapchatuser;

public class SortUsersByName implements Comparator<snapchatuser> {

	@Override
	public int compare(snapchatuser o1, snapchatuser o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
