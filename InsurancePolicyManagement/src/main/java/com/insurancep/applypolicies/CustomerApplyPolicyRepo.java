package com.insurancep.applypolicies;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerApplyPolicyRepo extends JpaRepository<CustomerApplyPolicy, Long>{

	public CustomerApplyPolicy findByPolicyId(long policyId);
	
	public List<CustomerApplyPolicy> findByCustomerEmail(String customerEmail);
	
	public List<CustomerApplyPolicy> findBypolicyStatus(String policyStatus);
	
	
}
