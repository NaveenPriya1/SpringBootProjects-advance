package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class CodeLabRepo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long repoAutoGenId;
	private String repoName;
	private Long repoOwnerId;
	
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "repos")
	private List<CodeLabUser> repoDevelopers= new ArrayList<>();
	
	
	@OneToMany(mappedBy = "repo")
	private List<CodeLabRepoVersion> versions;


	public CodeLabRepo() {
		super();
	}


	public long getRepoAutoGenId() {
		return repoAutoGenId;
	}


	public String getRepoName() {
		return repoName;
	}


	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}


	public long getRepoOwnerId() {
		return repoOwnerId;
	}


	public void setRepoOwnerId(long repoOwnerId) {
		this.repoOwnerId = repoOwnerId;
	}


	public List<CodeLabUser> getRepoDevelopers() {
		return repoDevelopers;
	}


	public List<CodeLabRepoVersion> getVersions() {
		return versions;
	}

	public void addDeveloper(CodeLabUser user){
		repoDevelopers.add(user);
	}
	
	public void addVersion(CodeLabRepoVersion version) {
		versions.add(version);
	}


	public void setRepoAutoGenId(long repoAutoGenId) {
		this.repoAutoGenId = repoAutoGenId;
	}


	public void setRepoDevelopers(List<CodeLabUser> repoDevelopers) {
		this.repoDevelopers = repoDevelopers;
	}


	public void setVersions(List<CodeLabRepoVersion> versions) {
		this.versions = versions;
	}
	
	

}
