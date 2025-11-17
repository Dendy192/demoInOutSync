package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.PIC006;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC0006Repository extends JpaRepository<PIC006, Timestamp> {
}
