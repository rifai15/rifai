package com.rifai.model.dao;

import org.hibernate.Session;

import com.rifai.model.hibernate.HibernateUtil;
/**
 * 
 * @author mrifai
 *	this class to add the common database functionality like insert ,delete,update
 */
public abstract class Dao {

	public Object insert (Object object){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(object);
		session.getTransaction().commit();
		return object;
	}





}
