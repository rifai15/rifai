package com.rifai.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.rifai.model.hibernate.HibernateUtil;
import com.rifai.model.vo.User;

public class ServiceDao extends Dao{

	private static ServiceDao serviceDao;
	public static ServiceDao getInstance(){
		if(serviceDao == null){
			serviceDao = new ServiceDao();
		}
		return serviceDao;
	}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public  User insertUser(String userName,String password ,String firstName,String lastName){
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		user.setFisrtName(firstName);
		user.setLastName(lastName);
		return (User) insert(user);
	}
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public int validateUser(String userName, String password) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria= 	session.createCriteria(User.class);
		criteria.add(Restrictions.like("username", userName));
		criteria.add(Restrictions.like("password", password));
		return criteria.list().size();

	}

}
