package com.tcs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.CodeLabUser;

@Repository
public interface CodeLabUserRepository extends JpaRepository<CodeLabUser, Long>{

	Optional<CodeLabUser> findByUserName(String userName);
	
}
