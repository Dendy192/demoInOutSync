package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.PIC001;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC0001Service extends JpaRepository<PIC001, Timestamp> {

}
