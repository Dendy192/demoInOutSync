package com.dendy.countinoutsync.firebird.primary.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TRNKRTLANG")
public class TRNKRTLANGModel {


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
