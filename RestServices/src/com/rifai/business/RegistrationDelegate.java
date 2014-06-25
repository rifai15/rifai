package com.rifai.business;

import com.rifai.model.Common;
import com.rifai.model.conf.SpringUtil;
import com.rifai.model.services.registrationService.api.RegistrationService;
/**
 * 
 * @author mrifai
 *
 */
public class RegistrationDelegate {

	private static RegistrationDelegate registrationDelegate = null;
	/**
	 * 
	 * @return
	 */
	public static RegistrationDelegate getInstance() {
		if (registrationDelegate == null) {
			registrationDelegate = new RegistrationDelegate();
		}
		return registrationDelegate;

	}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public String reigister(String userName, String password, String firstName, String lastName) {

		RegistrationService obj = SpringUtil.getBeanInstance(Common.REGISTRATION_SERVICE, RegistrationService.class);
		int userId = obj.rigisterUser(userName, password, firstName, lastName);
		return MessageBuilder.buildRegistrationMessage( userId);

	}

}
