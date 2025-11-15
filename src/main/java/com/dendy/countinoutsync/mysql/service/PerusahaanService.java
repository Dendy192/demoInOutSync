package com.dendy.countinoutsync.mysql.service;

import com.dendy.countinoutsync.mysql.model.MSTPERUSH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerusahaanService extends JpaRepository<MSTPERUSH, String> {
}
