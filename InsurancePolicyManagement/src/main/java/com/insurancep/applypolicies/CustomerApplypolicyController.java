package com.insurancep.applypolicies;

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
public class CustomerApplypolicyController {
    
	@Autowired
	CustomerApplyPolicyService policyService;
	
	@Autowired
	HttpStatus httpStatus;
	
	@PostMapping("/addpolicy")
	public HttpStatus saveApplication(@RequestBody CustomerApplyPolicy policy) {
		if(policyService.matchApplicationWithtopolicy(policy.getCustomerEmail())) {
			try {
				policyService.applyPolicy(policy);
				return httpStatus.CREATED;
			}catch(Exception e) {
				throw new ProjectException();
			}
		}else {
			throw new ProjectException("you cant applay to the above policy");
		}
		
	}
	
	
	@GetMapping("/getallapptopolicy")
	public List<CustomerApplyPolicy> getallapppolicies(){
		return policyService.showallpolicyapps();
	}
	
	//history of applications
	@GetMapping("/historyofapplies/{cemail}")
	public List<CustomerApplyPolicy> history(@PathVariable("cemail") String customerEmail){
		return policyService.historyBy(customerEmail);
		
		}
	
	//updatestatus
	@PutMapping("/updatestatus/{id}")
	public String updateStatus(@PathVariable("id") long applicaId,@RequestBody CustomerApplyPolicy policy) {
		CustomerApplyPolicy cp=policyService.updateStatus(applicaId,policy);
		if(cp!=null)
			return "updated";
		throw new ProjectException();
	}
	
	@GetMapping("/countofApproved")
	public int countOfApproved() {
		return policyService.countOfAppsBystatus("Approved");
	}
	
	@GetMapping("/countofpending")
	public int countOfpending() {
		return policyService.countOfAppsBystatus("Pending");
	}
	
	
	@GetMapping("/countofrejected")
	public int countOfRejected() {
		return policyService.countOfAppsBystatus("Rejected");
	}
	
	@GetMapping("/totalapps")
	public int countTotalApps() {
	  List<CustomerApplyPolicy> totalpolicies=policyService.showallpolicyapps();
	  return totalpolicies.size();
	}
	
	//get customer by status;
	
	@GetMapping("/getcustomerbyrej")
	public List<CustomerApplyPolicy> getrejectedApps(){
		return policyService.showDataStatus("Rejected");
	}
	
	@GetMapping("/getcustomerbyappr")
	public List<CustomerApplyPolicy> getApprovedApps(){
		return policyService.showDataStatus("Approved");
	}
	
	@GetMapping("/getcustomerbypend")
	public List<CustomerApplyPolicy> getPendingApps(){
		return policyService.showDataStatus("Pending");
	}
	
	
	//delete application by id
	@DeleteMapping("/deleteapplication/{id}")
	public HttpStatus deleteStatus(@PathVariable("id") long applicaId) {
		policyService.deleteApplication(applicaId);
		return httpStatus.OK;
	}
}
