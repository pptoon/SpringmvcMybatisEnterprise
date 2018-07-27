/**
 * 
 */
package com.ssmlearn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fatcat
 * @date 2018年7月27日下午12:17:43
 */
public class User implements Serializable {
	/**  */
	private static final long serialVersionUID = 283056053355310286L;
	private String loginname;
	private Date birthday;

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
	public String toString() {
		return "User [loginname=" + loginname + ", birthday=" + birthday + "]";
	}

}
