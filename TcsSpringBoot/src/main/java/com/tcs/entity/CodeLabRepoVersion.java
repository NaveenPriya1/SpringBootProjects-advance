package com.tcs.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CodeLabRepoVersion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer version;
	private Long versionOwnerId;
	private Boolean isMaster;
	private Boolean isMrPending;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "repo_id")
	private CodeLabRepo repo;

	public CodeLabRepoVersion() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getVersionOwnerId() {
		return versionOwnerId;
	}

	public void setVersionOwnerId(Long versionOwnerId) {
		this.versionOwnerId = versionOwnerId;
	}

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}

	public Boolean getIsMrPending() {
		return isMrPending;
	}

	public void setIsMrPending(Boolean isMrPending) {
		this.isMrPending = isMrPending;
	}

	public CodeLabRepo getRepo() {
		return repo;
	}

	public void setRepo(CodeLabRepo repo) {
		this.repo = repo;
	}
	
	
}
