package com.spring.bean;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
@Entity
@Table(name="cust")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int Customerid;
	
	private String firstName;
	private String lastName;
	private int age;

	private String mobileNo;
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return Customerid+"firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n mobileNo=" + mobileNo
				+ "\n email=" + email + "]";
	}
	

}
