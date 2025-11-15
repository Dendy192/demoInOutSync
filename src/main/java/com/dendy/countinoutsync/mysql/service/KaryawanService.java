package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.MSTKARY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanService extends JpaRepository<MSTKARY, String> {
}
