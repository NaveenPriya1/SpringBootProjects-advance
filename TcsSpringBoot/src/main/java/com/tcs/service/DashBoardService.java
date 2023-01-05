package com.tcs.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.CodeLabRepo;
import com.tcs.entity.CodeLabRepoVersion;
import com.tcs.entity.CodeLabUser;
import com.tcs.repository.CodeLabRepoRepository;
import com.tcs.repository.CodeLabRepoVersionRepository;
import com.tcs.repository.CodeLabUserRepository;

import jakarta.transaction.Transactional;

@Service
public class DashBoardService {

	
	@Autowired
	CodeLabRepoRepository repoRepository;
	
	@Autowired
	CodeLabRepoVersionRepository versionRepository;
	
	@Autowired
	CodeLabUserRepository userRepository;
	
	public Long saveRepo(String repo_name,Long userId) {
		CodeLabRepo repo=new CodeLabRepo();
		repo.setRepoName(repo_name);
		repo.setRepoOwnerId(userId);
		return repoRepository.save(repo).getRepoAutoGenId();
	}
	
	public List<CodeLabRepo> getUserOwnedRepos(Long userId){
		List<CodeLabRepo> repos=repoRepository.findByRepoOwnerId(userId);
		return repos;
	}
	
	public CodeLabRepo getRepoWithRepoidAndOwnerId (Long repoId,Long userId) {
		return repoRepository.findById(repoId).get();
	}
	
	public void addRepotousername(CodeLabRepo repo, String userName, Long ownerId) {
		CodeLabUser user=userRepository.findByUserName(userName).get();
		user.addRepo(repo);
		userRepository.save(user);
	}
	
	
	public Set<CodeLabRepo> getUserDevlopersrepos (Long userId){
		CodeLabUser user=userRepository.findById(userId).get();
		return user.getRepos();
	}
	
	public CodeLabRepo getRepoWithRepoIdAndDeveloperId(Long repoId, Long userId) {
		return repoRepository.findById(repoId).get();
	}
	
	
	public Integer uploadCode(Long userId,Long repoId) {
		CodeLabRepoVersion version= new CodeLabRepoVersion();
		version.setVersion(1);
		version.setVersionOwnerId(userId);
		version.setRepo(repoRepository.findById(repoId).get());
		return versionRepository.save(version).getId();
	}
	
	
	   @Transactional
	   public CodeLabRepo getRepoWithRepoidAndUseridAndVersionId(Long repoid,Long versionId,Integer version) {
		   CodeLabRepo repo=null;
		   try {
		   repo= repoRepository.findById(repoid).get();
		   repo.setVersions(versionRepository.findAll());
		   }catch(Exception e) {
			   System.out.println(e);
		   }
		   return repo;
	   }
	   
	   
	   public List<CodeLabUser> getAllUsersExcept(Long userId){
		   List<CodeLabUser> users=userRepository.findAll();
		   return users.stream().filter(user -> user.getUserAutoGenId() != userId)
				   .collect(Collectors.toList());
	   }
	
	
}
