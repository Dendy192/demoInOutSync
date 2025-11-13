package com.dendy.countinoutsync.firebird.primary.service;

import com.dendy.countinoutsync.firebird.primary.model.TRNKRTLANGModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TRNKRTLANGService extends JpaRepository<TRNKRTLANGModel, String> {
}
