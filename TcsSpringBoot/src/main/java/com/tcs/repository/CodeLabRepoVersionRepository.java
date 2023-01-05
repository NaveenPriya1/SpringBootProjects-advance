package com.tcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.CodeLabRepoVersion;

@Repository
public interface CodeLabRepoVersionRepository extends JpaRepository<CodeLabRepoVersion, Integer>{
 
	
}
