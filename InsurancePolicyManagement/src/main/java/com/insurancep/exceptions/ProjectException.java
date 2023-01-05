package com.insurancep.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ProjectException extends RuntimeException{

	private static final long serialVersionUID=1L;
	
	      public ProjectException(){
		         super();
	}
	      
	      public ProjectException(String s){
		         super(s);
	}
}
