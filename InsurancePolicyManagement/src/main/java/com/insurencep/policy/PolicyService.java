package com.insurencep.policy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	
	@Autowired
	PolicyRepo policyRepo;

	public void savePolicy(Policy policy) {
		// TODO Auto-generated method stub
		policyRepo.save(policy);
		
	}

	public List<Policy> getAllPolicies() {
		return policyRepo.findAll();
		// TODO Auto-generated method stub
		
		
	}

	public Policy getPolicyById(long policyId) {
		// TODO Auto-generated method stub
		return policyRepo.findById(policyId).get();
	}

	public Policy updatePolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepo.save(policy);
	}

	public void deletePolicyById(long policyId) {
		// TODO Auto-generated method stub
		policyRepo.deleteById(policyId);
	}



}
