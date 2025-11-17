package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.MSTPERUSH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerusahaanRepository extends JpaRepository<MSTPERUSH, String> {
}
