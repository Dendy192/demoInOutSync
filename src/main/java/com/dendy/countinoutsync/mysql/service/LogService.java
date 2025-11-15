package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.TRNGENLOG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface LogService extends JpaRepository<TRNGENLOG, Timestamp> {
}
