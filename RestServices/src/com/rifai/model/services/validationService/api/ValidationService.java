package com.rifai.model.services.validationService.api;

public interface ValidationService {
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return 0:Not Registered
	 * @DESC to validate if user registered
	 */
	public int validateUser(String userName,String password);
}
