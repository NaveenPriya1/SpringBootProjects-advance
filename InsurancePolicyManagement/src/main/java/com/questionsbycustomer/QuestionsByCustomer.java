package com.questionsbycustomer;

import com.Insurance.Management.TodaysDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsByCustomer {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long questionId;
	@Column(nullable = false)
	private String questionTopic;
	@Column(nullable = false)
	private String customerEmail;
	@Column(nullable = false)
	private String questionDetails;
	private String questionDate=TodaysDate.todayDate();
	private String questionAnswer;
	private String answerDate;
	
	public QuestionsByCustomer() {
		super();
	}

	public QuestionsByCustomer(String questionTopic, String customerEmail, String questionDetails, String questionDate,
			String questionAnswer, String answerDate) {
		super();
		this.questionTopic = questionTopic;
		this.customerEmail = customerEmail;
		this.questionDetails = questionDetails;
		this.questionDate = questionDate;
		this.questionAnswer = questionAnswer;
		this.answerDate = answerDate;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTopic() {
		return questionTopic;
	}

	public void setQuestionTopic(String questionTopic) {
		this.questionTopic = questionTopic;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(String questionDetails) {
		this.questionDetails = questionDetails;
	}

	public String getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}

	@Override
	public String toString() {
		return "QuestionsByCustomer [questionId=" + questionId + ", questionTopic=" + questionTopic + ", customerEmail="
				+ customerEmail + ", questionDetails=" + questionDetails + ", questionDate=" + questionDate
				+ ", questionAnswer=" + questionAnswer + ", answerDate=" + answerDate + "]";
	}
	
	
}
