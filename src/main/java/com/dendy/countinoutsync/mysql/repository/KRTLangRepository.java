package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.TRNKRTLANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KRTLangRepository extends JpaRepository<TRNKRTLANG, String> {
}
