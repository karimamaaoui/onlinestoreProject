package com.mystoreapplication.buisness.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mystoreapplication.buisness.service.IUserService;
import com.mystoreapplication.dao.entity.ERoleUser;
import com.mystoreapplication.dao.entity.User;
import com.mystoreapplication.dao.repositories.UserRepository;
import com.mystoreapplication.web.requests.UserForm;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser (UserForm userForm) {

		if(userForm.getRole()==null)
		{
			userForm.setRole(ERoleUser.CLIENT);
			}
		User user = new User(
				null, 
				userForm.getFirstname(),
				userForm.getLastname(),
				userForm.getEmail(), 
				passwordEncoder.encode(userForm.getPassword()) ,
				userForm.getRole());
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long userId) {
	    return userRepository.findById(userId).orElse(null);
	}

}
