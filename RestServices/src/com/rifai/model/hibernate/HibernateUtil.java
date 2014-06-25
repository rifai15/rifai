package com.rifai.model.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	/**
	 * 
	 * @return
	 */
	private static SessionFactory buildSessionFactory() {
		try {

			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {

			throw new ExceptionInInitializerError(ex);
		}
	}
	/**
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * 
	 */
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}