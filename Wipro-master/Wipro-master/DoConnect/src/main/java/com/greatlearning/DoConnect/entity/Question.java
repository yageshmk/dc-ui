package com.greatlearning.DoConnect.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message = "Question can not be blank")
	private String question;
	@OneToOne
	private User user;
	@NotBlank(message = "provide the topic")
	private String topic;
	private Boolean isApproved = false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}
	public Question() {
		super();
	}
	public Question(Long id, @NotBlank(message = "Question can not be blank") String question, User user,
			@NotBlank(message = "provide the topic") String topic, Boolean isApproved) {
		super();
		this.id = id;
		this.question = question;
		this.user = user;
		this.topic = topic;
		this.isApproved = isApproved;
	}
	
}
