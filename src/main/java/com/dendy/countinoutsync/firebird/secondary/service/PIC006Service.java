package com.dendy.countinoutsync.firebird.secondary.service;

import com.dendy.countinoutsync.firebird.secondary.model.PIC006Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC006Service extends JpaRepository<PIC006Model, Timestamp> {
}
