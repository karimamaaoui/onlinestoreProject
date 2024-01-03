package com.mystoreapplication.buisness.service;

import com.mystoreapplication.dao.entity.User;
import com.mystoreapplication.web.requests.UserForm;

public interface IUserService {
	
	User addUser (UserForm userForm);
	User getUserById(Long userId);

}
