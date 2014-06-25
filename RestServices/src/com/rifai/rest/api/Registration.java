package com.rifai.rest.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rifai.business.RegistrationDelegate;
import com.rifai.rest.util.Params;
import com.rifai.rest.util.Paths;

/**
 * 
 * @author mrifai The class registers its methods for the HTTP POST request using the @POST annotation. Using
 *         the
 * @Produces annotation
 */
@Path(Paths.REGISTRATION_SERVICE)
public class Registration {

	// This method is called if TEXT_PLAIN is request
	@POST
	@Path(Paths.REGISTER)
	@Produces(MediaType.TEXT_PLAIN)
	public String registerUser(@QueryParam(Params.USERNAME) String userName,
			@QueryParam(Params.PASSWORD) String password, @QueryParam(Params.FIRSTNAME) String firstName,
			@QueryParam(Params.LASTNAME) String lastName) {

		RegistrationDelegate registrationDelegate = RegistrationDelegate.getInstance();
		String message = registrationDelegate.reigister(userName, password, firstName, lastName);

		return message;
	}

}
