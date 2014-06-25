package com.rifai.rest.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rifai.business.ValidationDelegate;
import com.rifai.rest.util.Params;
import com.rifai.rest.util.Paths;

/**
 * The class Validate User its methods for the HTTP POST request using the @POST annotation. Using the @Produces
 * annotation
 * 
 * @author mrifai
 * 
 */
@Path(Paths.VALIDATION_SERVICE)
public class UserValidation {

	// This method is called if TEXT_PLAIN is request
	@POST
	@Path(Paths.VALIDATE)
	@Produces(MediaType.TEXT_PLAIN)
	public String validateUser(@QueryParam(Params.USERNAME) String userName,
			@QueryParam(Params.PASSWORD) String password) {

		ValidationDelegate validationDelegate = new ValidationDelegate();
		String message = validationDelegate.validateUser(userName, password);

		return message;
	}

}
