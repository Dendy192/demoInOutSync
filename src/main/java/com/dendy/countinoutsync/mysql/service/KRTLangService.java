package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.TRNKRTLANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KRTLangService extends JpaRepository<TRNKRTLANG, String> {
}
