package com.rifai.model.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rifai.model.Common;
import com.rifai.model.services.registrationService.api.RegistrationService;
import com.rifai.model.services.registrationService.impl.RegistrationServiceImpl;
import com.rifai.model.services.validationService.api.ValidationService;
import com.rifai.model.services.validationService.impl.ValidationServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name=Common.REGISTRATION_SERVICE)
	public RegistrationService registrationService() {
		return new RegistrationServiceImpl();
	}

	@Bean(name=Common.VALIDATION_SERVICE)
	public ValidationService  validationService() {
		return new ValidationServiceImpl();
	}
}