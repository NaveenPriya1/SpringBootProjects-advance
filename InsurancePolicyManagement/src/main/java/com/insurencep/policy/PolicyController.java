package com.insurencep.policy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurancep.exceptions.ProjectException;

@RestController
@CrossOrigin("http://localhost:4200")
public class PolicyController {

	@Autowired
	PolicyService policyService;
	HttpStatus httpStatus;
	
	//add policy
	
	@PostMapping("/addpolicy")
	public HttpStatus addPolicy(@RequestBody Policy policy) {
		try {
		policyService.savePolicy(policy);
		return httpStatus.CREATED;
		}catch(Exception e) {
			throw new ProjectException();
		}
	}
	
	@GetMapping("/getpolicies")
	public List<Policy> getAllPolicies(){
		try {
		return policyService.getAllPolicies();
		}catch(Exception e ) {
			throw new ProjectException();
		}
	}
	
	@PutMapping("/updatepolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		Policy old=policyService.getPolicyById(policy.getPolicyId());
		if(old!=null) {
			try {
			return policyService.updatePolicy(policy);
			}catch(Exception e) {
				throw new ProjectException();
			}
		}else {
			throw new ProjectException();
		}
	}
	
	@DeleteMapping("/deletepolicy/{id}")
		public HttpStatus deletePolicyById(@PathVariable("id") long policyId) {
			try {
			policyService.deletePolicyById(policyId);
			return httpStatus.OK;
			}catch(Exception e) {
				throw new ProjectException();
			}
		}
	
	
	@GetMapping("/numberofpolicies")
	public int policiesCount() {
		try {
		List<Policy> policyList=policyService.getAllPolicies();
			return policyList.size();
		}catch(Exception e) {
			throw new ProjectException();
		}
		}
	
	}
	

