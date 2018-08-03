package com.ssmlearn.domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author fatcat
 * @date 2018年8月2日下午4:51:48
 * 域对象，实现序列化接口
 */
public class User implements Serializable{

	/** serialVersionUID */
	private static final long serialVersionUID = -2815391090399606599L;
	private String username;
	private MultipartFile image;

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
