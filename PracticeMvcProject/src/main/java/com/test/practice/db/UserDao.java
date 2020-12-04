package com.test.practice.db;

import com.test.practice.model.User;

public interface UserDao {
	public void signup(User u);

	public User Login(String un, String psw);

}
