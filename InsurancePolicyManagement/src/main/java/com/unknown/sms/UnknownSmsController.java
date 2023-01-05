package com.unknown.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancep.exceptions.ProjectException;

@RestController
@CrossOrigin("/http://localhost:4200")
public class UnknownSmsController {

	@Autowired
	UnknownSmsService smsService;
	HttpStatus httpStatus;
	
	//save un known sms
	@PostMapping("/save")
	public HttpStatus addSms(@RequestBody UnknownSms unknownSms) {
		try {
		UnknownSms sms=smsService.addSms(unknownSms);
		if(sms!=null)
			return HttpStatus.CREATED;
		else
			throw new ProjectException();
		}catch(Exception e) {
			throw new ProjectException();
		}
		
	}
	
	//get all unknown sms
	@GetMapping("/allsms")
	public List<UnknownSms> getallSms(){
		try {
		List<UnknownSms> list=smsService.getAllSms();
		if(list.size()>0) {
			return list;
		}else {
			throw new ProjectException();
		}
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	
	//unknown sms count
	public int countOfSms() {
		try {
		List<UnknownSms> list=smsService.getAllSms();
		return list.size();
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	
	@DeleteMapping("/deletesms/{id}")
	public String deleteSmsById(@PathVariable("id") long unknownSmsId) {
		try {
			smsService.deleteSmsById(unknownSmsId);
			return unknownSmsId+"sms deleted";
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
}
