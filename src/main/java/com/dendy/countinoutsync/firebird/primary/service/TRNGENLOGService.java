package com.dendy.countinoutsync.firebird.primary.service;

import com.dendy.countinoutsync.firebird.primary.model.TRNGENLOGModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface TRNGENLOGService extends JpaRepository<TRNGENLOGModel, Timestamp> {
}
