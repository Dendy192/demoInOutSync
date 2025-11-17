package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.MSTGATE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GateRepository extends JpaRepository<MSTGATE, String> {
}
