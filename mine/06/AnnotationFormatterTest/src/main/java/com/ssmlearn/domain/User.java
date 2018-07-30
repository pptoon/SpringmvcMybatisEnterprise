/**
 * 
 */
package com.ssmlearn.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 * @author fatcat
 * @date 2018骞�7鏈�27鏃ヤ笅鍗�12:17:43
 */
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4588912996908396685L;
	// 鏃ユ湡绫诲瀷
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	// 姝ｅ父鏁板瓧绫诲瀷
	@NumberFormat(style=Style.NUMBER, pattern="#,###")  
    private int total;  
	// 鐧惧垎鏁扮被鍨�
    @NumberFormat(style=Style.PERCENT)  
    private double discount;  
    // 璐у竵绫诲瀷
    @NumberFormat(style=Style.CURRENCY)  
    private double money;  
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [birthday=" + birthday + ", total=" + total
				+ ", discount=" + discount + ", money=" + money + "]";
	}
}
