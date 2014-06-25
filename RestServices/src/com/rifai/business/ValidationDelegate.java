package com.rifai.business;

import com.rifai.model.Common;
import com.rifai.model.conf.SpringUtil;
import com.rifai.model.services.validationService.api.ValidationService;



/**
 * 
 * @author mrifai
 *
 */
public class ValidationDelegate {
	private static ValidationDelegate validationDelegate ;

	/**
	 * One instance will be created even if we get many Request
	 * @return
	 */
	public static ValidationDelegate getInstance() {
		if (validationDelegate == null) {
			validationDelegate = new ValidationDelegate();
		}
		return validationDelegate;
	}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public String validateUser(String userName,String password){

		ValidationService validationService = SpringUtil.getBeanInstance(Common.VALIDATION_SERVICE, ValidationService.class);
		int resultSize = validationService.validateUser(userName, password);
		return MessageBuilder.buildValidationMessage(resultSize);
	}



}