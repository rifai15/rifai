package com.rifai.model.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8499332014004133250L;
	private int userId;
	private String username;
	private String password;
	private String fisrtName;
	private String lastName;

	public User() {
	}


	public User(int userId, String username, String password, String fisrtName, String lastName) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}


	@Id
	@SequenceGenerator(name = "UserSequence", sequenceName = "ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UserSequence")
	@Column(name = "USER_ID", unique = true, nullable = false, precision = 5, scale = 0)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME", nullable = false, length = 20)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "USER_PASSWORD", nullable = false, length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USER_FIRSTNAME", nullable = true, length = 20)
	public String getFisrtName() {
		return fisrtName;
	}


	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	@Column(name = "USER_LASTNAME", nullable = true, length = 20)
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



}
