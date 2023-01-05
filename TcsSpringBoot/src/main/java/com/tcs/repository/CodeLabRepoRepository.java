package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.CodeLabRepo;

@Repository
public interface CodeLabRepoRepository extends JpaRepository<CodeLabRepo, Long>{

	
	List<CodeLabRepo> findByRepoOwnerId(Long userId);
}
