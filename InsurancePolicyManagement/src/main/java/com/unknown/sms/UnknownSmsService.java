package com.unknown.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnknownSmsService {

	@Autowired
	UnknownSmsRepo smsRepo;

	public UnknownSms addSms(UnknownSms unknownSms) {
		// TODO Auto-generated method stub
		return smsRepo.save(unknownSms);
	}

	public List<UnknownSms> getAllSms() {
		// TODO Auto-generated method stub
		return smsRepo.findAll();
	}

	public String deleteSmsById(long unknownSmsId) {
		// TODO Auto-generated method stub
		smsRepo.deleteById(unknownSmsId);
		return unknownSmsId+"sms deleted";
	}

	
}
