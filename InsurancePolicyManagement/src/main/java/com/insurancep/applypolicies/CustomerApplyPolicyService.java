package com.insurancep.applypolicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurencep.policy.PolicyService;

@Service
public class CustomerApplyPolicyService {
    
	@Autowired
	CustomerApplyPolicyRepo applypolicyrepo;
	@Autowired
	PolicyService policyService;


	


	public CustomerApplyPolicy applyPolicy(CustomerApplyPolicy applypolicy) {
		// TODO Auto-generated method stub
		return applypolicyrepo.save(applypolicy);
	}


	public List<CustomerApplyPolicy> showallpolicyapps() {
		// TODO Auto-generated method stub
		return applypolicyrepo.findAll();
	}


	public List<CustomerApplyPolicy> historyBy(String customerEmail) {
		// TODO Auto-generated method stub
		return applypolicyrepo.findByCustomerEmail(customerEmail);
	}


	public CustomerApplyPolicy updateStatus(long policyId, CustomerApplyPolicy policy) {
		// TODO Auto-generated method stub
		CustomerApplyPolicy cp=applypolicyrepo.findById(policyId).get();
		if(cp!=null)
			cp.setPolicyStatus(policy.getPolicyStatus());
		return null;
	}



	public List<CustomerApplyPolicy> showDataStatus(String status) {
		
		List<CustomerApplyPolicy> list=applypolicyrepo.findBypolicyStatus(status);
		return list;
		// TODO Auto-generated method stub
		
	}


	public int countOfAppsBystatus(String status) {
		// TODO Auto-generated method stub
		
		List<CustomerApplyPolicy> list=applypolicyrepo.findBypolicyStatus(status);
		return list.size();
	}




	public void deleteApplication(long policyId) {
		// TODO Auto-generated method stub
		applypolicyrepo.deleteById(policyId);
	}


	public boolean matchApplicationWithtopolicy(String customerEmail) {
		// TODO Auto-generated method stub
		int total_policies=policyService.getAllPolicies().size();
		int appliedpolicies=historyBy(customerEmail).size();
		if(total_policies>appliedpolicies)
			return true;
		return false;
	}
}
