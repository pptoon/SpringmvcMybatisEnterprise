package com.ssmlearn.domain;

import java.io.Serializable;

public class User implements Serializable {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5070015551804813355L;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String sex, Integer age) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
	}
	private String username;
	private String sex;
	private Integer age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	
	
	
}
