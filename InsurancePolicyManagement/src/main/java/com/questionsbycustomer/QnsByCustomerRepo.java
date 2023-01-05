package com.questionsbycustomer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QnsByCustomerRepo extends JpaRepository<QuestionsByCustomer, Long>{

	public List<QuestionsByCustomer> findallQnsByCusEmail(String customerEmail);
	
	public List<QuestionsByCustomer> findallQnsByAnswer(String QnsAnswer);
}
