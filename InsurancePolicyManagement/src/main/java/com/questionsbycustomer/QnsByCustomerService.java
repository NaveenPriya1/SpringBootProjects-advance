package com.questionsbycustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnsByCustomerService {

	@Autowired
	QnsByCustomerRepo questionsRepo;

	public QuestionsByCustomer addQuestion(QuestionsByCustomer questions) {
		// TODO Auto-generated method stub
		return questionsRepo.save(questions);
		
	}

	public List<QuestionsByCustomer> findByReply() {
		// TODO Auto-generated method stub
		return questionsRepo.findallQnsByAnswer(null);
	}

	public List<QuestionsByCustomer> getAllQns() {
		// TODO Auto-generated method stub
		return questionsRepo.findAll();
	}

	public QuestionsByCustomer updateQuestion(long questionId, QuestionsByCustomer qc) {
		// TODO Auto-generated method stub
		QuestionsByCustomer question=questionsRepo.findById(questionId).get();
		if(question!=null) {
			question.setAnswerDate(qc.getAnswerDate());
			question.setQuestionAnswer(qc.getQuestionAnswer());
			return questionsRepo.save(question);
		}else {
		return null;
		}
	}

	public List<QuestionsByCustomer> getAllqnsByCustomer(String customerEmail) {
		// TODO Auto-generated method stub
		return questionsRepo.findallQnsByCusEmail(customerEmail);
	}
}
