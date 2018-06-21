package com.ssmlearn.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6325030355206691029L;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(boolean reader, List<String> courses) {
		super();
		this.reader = reader;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "User [reader=" + reader + ", courses=" + courses + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + (reader ? 1231 : 1237);
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
		if (courses == null) {
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (reader != other.reader)
			return false;
		return true;
	}
	private boolean reader;
	public boolean isReader() {
		return reader;
	}
	public void setReader(boolean reader) {
		this.reader = reader;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	private List<String> courses;
}
