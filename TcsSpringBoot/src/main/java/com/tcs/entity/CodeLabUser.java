package com.tcs.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class CodeLabUser {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userAutoGenId;
	private String fullName;
	private String userName;
	private String password;
	//
	
	@ManyToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinTable(name="repo_Developers",
	           joinColumns = {@JoinColumn(name="user_id")},
	           inverseJoinColumns = {@JoinColumn(name="repo_id")})
    Set<CodeLabRepo>  repos=new HashSet<>();
	
	public CodeLabUser() {
		super();
	}

	public Long getUserAutoGenId() {
		return userAutoGenId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<CodeLabRepo> getRepos() {
		return repos;
	}

	public void setRepos(Set<CodeLabRepo> repos) {
		this.repos = repos;
	}
	
	public Object getVersionOwnerId() {
		return null;
	}
	
	public Object getId() {
		return null;
	}
	
	public CodeLabRepo getRepo() {
		return null;
	}
	
	public void addRepo(CodeLabRepo repo) {
		repos.add(repo);
	}
	
	
	
}
