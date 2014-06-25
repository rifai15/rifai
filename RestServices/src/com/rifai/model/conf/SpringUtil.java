package com.rifai.model.conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 
 * @author mrifai
 *
 */
public class SpringUtil {
	/**
	 * 
	 * @param beanName
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBeanInstance(String beanName, Class<T> clazz){

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		return (T) context.getBean(beanName);
	}


}
