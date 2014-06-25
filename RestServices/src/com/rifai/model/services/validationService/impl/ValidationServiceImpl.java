package com.rifai.model.services.validationService.impl;

import com.rifai.model.dao.ServiceDao;
import com.rifai.model.services.validationService.api.ValidationService;
/**
 * 
 * @author mrifai
 *
 */
public class ValidationServiceImpl implements ValidationService {
	/**
	 * This method to validate is  user Registered
	 */
	@Override
	public int validateUser(String userName, String password) {
		int result =	ServiceDao.getInstance().validateUser(userName, password);
		return result;

	}



}
