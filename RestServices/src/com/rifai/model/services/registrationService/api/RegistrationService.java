package com.rifai.model.services.registrationService.api;
/**
 * 
 * @author mrifai
 *
 */
public interface RegistrationService {
	/**
	 * 
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @return user ID
	 * @Desc To register user
	 */
	public int rigisterUser(String userName,String password ,String firstName,String lastName);

}
