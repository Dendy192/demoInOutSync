package com.dendy.countinoutsync.firebird.primary.service;

import com.dendy.countinoutsync.firebird.primary.model.SYSACCESModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SYSACCESService extends JpaRepository<SYSACCESModel, String> {
}
