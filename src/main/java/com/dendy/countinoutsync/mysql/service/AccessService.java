package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.SYSACCES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessService extends JpaRepository<SYSACCES, String> {
}
