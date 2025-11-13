package com.dendy.countinoutsync.firebird.primary.service;

import com.dendy.countinoutsync.firebird.primary.model.MSTGATEModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MSTGATEService extends JpaRepository<MSTGATEModel, String> {
}
