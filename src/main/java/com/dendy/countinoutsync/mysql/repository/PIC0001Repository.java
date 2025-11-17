package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.PIC001;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface PIC0001Repository extends JpaRepository<PIC001, Timestamp> {

}
