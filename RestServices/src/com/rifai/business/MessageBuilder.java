package com.rifai.business;
/**
 * 
 * @author mrifai
 * this class to build response Message
 */
public class MessageBuilder {

	/**
	 * 
	 * @param Id
	 * @return
	 */
	public static String buildRegistrationMessage(int id ){
		StringBuilder messBuilder = new StringBuilder("User Id Is :");
		messBuilder.append(id);
		return messBuilder.toString();
	}
	/**
	 * 
	 * @param size
	 * @return
	 */
	public static String buildValidationMessage(int size ){
		StringBuilder messBuilder = null;
		if(size >0){
			messBuilder = new StringBuilder("Ok");

		}else{
			messBuilder = new StringBuilder("Ko");
		}
		return messBuilder.toString();
	}
}
