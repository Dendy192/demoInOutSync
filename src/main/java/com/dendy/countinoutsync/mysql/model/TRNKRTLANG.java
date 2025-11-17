package com.dendy.countinoutsync.mysql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TRNKRTLANG")
public class TRNKRTLANG {


    @Column(name = "TRNID")
    private String id;

    @Column(name = "TRNCARDNO")
    private String cardNo;

    @Id
    @Column(name = "TRNTIMEIN")
    private Timestamp tapMasuk;

    @Column(name = "TRNGATEIN")
    private String gateMasuk;

    @Column(name = "TRNCEKOUT")
    private int cekOut;

    @Column(name = "TRNTIMEOUT")
    private Timestamp tapKeluar;

    @Column(name = "TRNGATEOUT")
    private String gateKeluar;

}
