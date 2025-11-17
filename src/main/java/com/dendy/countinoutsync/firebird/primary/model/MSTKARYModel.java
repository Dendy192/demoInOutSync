package com.dendy.countinoutsync.firebird.primary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@Entity
@Data
@Table(name = "MSTKARY")
public class MSTKARYModel {
    @Id
    @Column(name = "MSTID")
    private String id;

    @Column(name = "MSTNAMA2")
    private String nama;

    @Column(name = "MSTJAB")
    private String jabatan;

    @Column(name = "MSTTAG")
    private String noKartu;

    @Column(name = "MSTMANDOR")
    private String perusahaan;

    @Column(name = "MSTPASS")
    private String pass;

    @Column(name = "MSTACTIVE")
    private int status;

    @Column(name = "MSTVALID")
    private Date berlaku;

    @Column(name = "MSTUNV")
    private int unv;

    @Column(name = "MSTNAMA1")
    private String phoneNumber;

    @Column(name = "MSTTMP1")
    private String noKtp;

}
