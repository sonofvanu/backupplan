package com.stackroute.activitystream.backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stackroute.activitystream.backend.model.UserCircle;


public interface UserCircleDAO {
	
	public boolean addUserToCircle(UserCircle userCircle);
	
	public boolean removeUserFromCircle(UserCircle userCircle);
	
	public List<UserCircle> listOfCirclesOfAuser(String userId);
	
	public List<UserCircle> listOfUsersOfACircle(int circleId);
	
	

}
