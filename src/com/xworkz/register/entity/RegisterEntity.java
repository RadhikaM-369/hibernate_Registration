package com.xworkz.register.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="hibernate.register")

public class RegisterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name="uName")
	private String userName;
	
	@Column(name="emailID")
	private String emailId;
	
	@Column(name="pasword")
	private String password;
	
	@Column(name="cityName")
	private String city;
	
	@Column(name="countryName")
	private String country;
	
	@Column(name="mobileNO")
	private long mobileNo;
	
	@Column(name="indianCitizenn")
	private boolean indianCitizen;

	public RegisterEntity(String userName, String emailId, String password, String city, String country, long mobileNo,
			boolean indianCitizen) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileNo = mobileNo;
		this.indianCitizen = indianCitizen;
	}
	
	
	
	
	

}
