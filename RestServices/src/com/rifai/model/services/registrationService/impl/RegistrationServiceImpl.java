package com.rifai.model.services.registrationService.impl;

import com.rifai.model.dao.ServiceDao;
import com.rifai.model.services.registrationService.api.RegistrationService;
import com.rifai.model.vo.User;

/**
 * 
 * @author mrifai
 * 
 */
public class RegistrationServiceImpl implements RegistrationService {
	@Override
	public int rigisterUser(String userName, String password, String firstName, String lastName) {
		User dbUser = ServiceDao.getInstance().insertUser(userName, password, firstName, lastName);
		return dbUser.getUserId();
	}
}
