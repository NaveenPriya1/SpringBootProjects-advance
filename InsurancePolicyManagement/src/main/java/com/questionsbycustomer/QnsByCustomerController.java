package com.questionsbycustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancep.exceptions.ProjectException;


@RestController
@CrossOrigin("http://localhost:4200")
public class QnsByCustomerController {

	@Autowired
	QnsByCustomerService questionService;
	HttpStatus httpStatus;
	
	//save question
	@PostMapping("/addQuestion")
	public HttpStatus addQuestion(@RequestBody QuestionsByCustomer questions) {
		try {
		questionService.addQuestion(questions);
		return HttpStatus.CREATED;
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	@GetMapping("/findqnsbystatus")
	public List<QuestionsByCustomer> getAllpendingreply(){
		try {
	return  questionService.findByReply();
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	
	@GetMapping("/countnotreply")
	public int countAllPendingReply() {
		try {
		List<QuestionsByCustomer> list=questionService.findByReply();
		return list.size();
	}catch(Exception e) {
		throw new ProjectException();
	}
	}
	
	@GetMapping("getallqns")
	public List<QuestionsByCustomer> getAllQns(){
		try {
		return questionService.getAllQns();
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	@PutMapping("/answers/{id}")
	public HttpStatus giveAnswers(@PathVariable("id") long questionId,@RequestBody QuestionsByCustomer qc) {
		try {
		QuestionsByCustomer question=questionService.updateQuestion(questionId,qc);
		if(question!=null)
			return httpStatus.OK;
		throw new ProjectException("Question id "+questionId+" not found");
		}catch(Exception e) {
			throw new ProjectException("Question id "+questionId+" not found");
		}
	}
	
	//find all questions by customer email id
	@GetMapping("/findqns/{email}")
	public List<QuestionsByCustomer> findQnsByCustomer(@PathVariable("email") String customerEmail){
		List<QuestionsByCustomer> questionsList=questionService.getAllqnsByCustomer(customerEmail);
		if(questionsList.size()>0)
			return questionsList;
		throw new ProjectException();

	}
	
	//count customer questions
	@GetMapping("/countqns")
	public int countOfAllQns() {
		try {
		List<QuestionsByCustomer> list= questionService.getAllQns();
		return list.size();
		}catch(Exception e) {
			throw new ProjectException();
		}
				
	}
}
