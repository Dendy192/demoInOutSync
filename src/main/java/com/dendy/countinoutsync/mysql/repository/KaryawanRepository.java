package com.dendy.countinoutsync.mysql.repository;

import com.dendy.countinoutsync.mysql.model.MSTKARY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanRepository extends JpaRepository<MSTKARY, String> {
}
