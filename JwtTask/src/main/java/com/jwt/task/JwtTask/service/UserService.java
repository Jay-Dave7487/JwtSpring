package com.jwt.task.JwtTask.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.task.JwtTask.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Jay Dave","jay.d@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"J D","jd@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Jy Dav","jayy@gmail.com"));
	}
	public List<User> getUsers() {
		return this.store;
	}
}
