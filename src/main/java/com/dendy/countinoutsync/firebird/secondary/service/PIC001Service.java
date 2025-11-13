package com.dendy.countinoutsync.firebird.secondary.service;

import com.dendy.countinoutsync.firebird.secondary.model.PIC001Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC001Service extends JpaRepository<PIC001Model, Timestamp> {

}
