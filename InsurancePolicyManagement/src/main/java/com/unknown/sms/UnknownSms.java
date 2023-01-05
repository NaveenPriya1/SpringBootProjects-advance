package com.unknown.sms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnknownSms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long unknownSmsId;
	@Column(nullable = false)
	private String unknownSmsEmail;
	private String msg;
	@Column(nullable = false)
	private String unknownSmsName;
	
	public UnknownSms() {
		super();
	}

	public UnknownSms(String unknownSmsEmail, String msg, String unknownSmsName) {
		super();
		this.unknownSmsEmail = unknownSmsEmail;
		this.msg = msg;
		this.unknownSmsName = unknownSmsName;
	}

	public long getUnknownSmsId() {
		return unknownSmsId;
	}

	public void setUnknownSmsId(long unknownSmsId) {
		this.unknownSmsId = unknownSmsId;
	}

	public String getUnknownSmsEmail() {
		return unknownSmsEmail;
	}

	public void setUnknownSmsEmail(String unknownSmsEmail) {
		this.unknownSmsEmail = unknownSmsEmail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUnknownSmsName() {
		return unknownSmsName;
	}

	public void setUnknownCusName(String unknownSmsName) {
		this.unknownSmsName = unknownSmsName;
	}

	@Override
	public String toString() {
		return "UnknownCustomer [unknownSmsId=" + unknownSmsId + ", unknownSmsEmail=" + unknownSmsEmail + ", msg=" + msg
				+ ", unknownSmsName=" + unknownSmsName + "]";
	}
	
	
}
