package com.ssmlearn.domain;

import java.io.Serializable;

/**
 * @author fatcat
 * @date 2018年8月2日 书
 */
public class Book implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 802053161214831255L;
	/**
	 * id
	 */
	private Integer id;
	/**
	 * 书名
	 */
	private String name;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 价格
	 */
	private Double price;
	/**
	 * 封面图片
	 */
	private String image;

	public Book() {
		super();
	}

	public Book(String image, String name, String author, Double price) {
		super();
		this.image = image;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", image=" + image
				+ "]";
	}

}
