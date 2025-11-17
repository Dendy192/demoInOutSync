package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.TRNGENLOG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface LogRepository extends JpaRepository<TRNGENLOG, Timestamp> {
}
