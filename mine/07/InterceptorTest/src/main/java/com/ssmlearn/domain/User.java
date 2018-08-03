package com.ssmlearn.domain;

import java.io.Serializable;

/**
 * @author fatcat
 * @date 2018年8月2日
 *	用户
 */
public class User implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6219195257751124817L;
	/**
	 *  id
	 */
	private Integer id;			
	/**
	 * 登录名
	 */
	private String loginname;
	/**
	 * 密码
	 */
	private String password;	
	/**
	 * 用户名
	 */
	private String username;	
	public User() {
		super();
	}
	
	
	public User(String loginname, String password) {
		super();
		this.loginname = loginname;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password="
				+ password + ", username=" + username + "]";
	}
	
	
}
