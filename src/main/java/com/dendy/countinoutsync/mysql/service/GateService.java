package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.MSTGATE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GateService extends JpaRepository<MSTGATE, String> {
}
