package com.greatlearning.DoConnect.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "Name is mandatory")
	private String name;
	@NotBlank(message = "Password is mandatory")
	@Size(min = 8)
	private String password;
	@NotBlank(message = "email is mandatory")
	@Email(message = "Enter a valid mail only")
	private String email;
	@NotBlank(message = "phone number is mandatory")
	@Size(max = 10, min = 10)
	private String phoneNumber;

	private Boolean isActive = true;

	public User(Long id, @NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Password is mandatory") @Size(min = 8) String password,
			@NotBlank(message = "email is mandatory") @Email(message = "Enter a valid mail only") String email,
			@NotBlank(message = "phone number is mandatory") @Size(max = 10, min = 10) String phoneNumber,
			Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}