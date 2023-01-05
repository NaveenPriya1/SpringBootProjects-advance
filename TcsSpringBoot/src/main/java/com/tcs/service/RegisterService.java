package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.CodeLabUser;
import com.tcs.repository.CodeLabUserRepository;

@Service
public class RegisterService {
	
	@Autowired
	CodeLabUserRepository userRepository;
	
	public Long userRegister(String fullname,String userName,String password) {
		CodeLabUser user= new CodeLabUser();
		user.setFullName(fullname);
		user.setUserName(userName);
		user.setPassword(password);
		
		return userRepository.save(user).getUserAutoGenId();
	}

}
