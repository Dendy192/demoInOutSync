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
@Table(name = "TRNGENLOG")
public class TRNGENLOG {
    @Id
    @Column(name = "TRNLOG")
    private Timestamp log;

    @Column(name = "TRNID")
    private String id;

    @Column(name = "TRNTYPE")
    private int type;

}
