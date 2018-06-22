package com.ssmlearn.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5520133197326494239L;
	private String loginname;
	private Date birthday;
	
	
	
	public User(String loginname, Date birthday) {
		super();
		this.loginname = loginname;
		this.birthday = birthday;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((loginname == null) ? 0 : loginname.hashCode());
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
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (loginname == null) {
			if (other.loginname != null)
				return false;
		} else if (!loginname.equals(other.loginname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [loginname=" + loginname + ", birthday=" + birthday + "]";
	}

	
	
	
}
