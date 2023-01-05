package com.unknown.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnknownSmsRepo extends JpaRepository<UnknownSms, Long>{

}
