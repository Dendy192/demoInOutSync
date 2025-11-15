package com.dendy.countinoutsync.firebird.primary.service;

import com.dendy.countinoutsync.firebird.primary.model.MSTKARYModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MSTKARYService extends JpaRepository<MSTKARYModel, String> {
}
