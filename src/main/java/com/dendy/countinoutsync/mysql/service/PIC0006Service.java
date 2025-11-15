package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.PIC006;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC0006Service extends JpaRepository<PIC006, Timestamp> {
}
