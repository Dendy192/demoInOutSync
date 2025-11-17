package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.SYSACCES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepository extends JpaRepository<SYSACCES, String> {
}
