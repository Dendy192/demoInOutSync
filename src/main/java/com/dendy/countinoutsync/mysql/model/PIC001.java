package com.dendy.countinoutsync.mysql.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PIC001")
public class PIC001 {
    @Id
    @Column(name = "PLOG")
    private Timestamp plog;

    @Column(name = "PID")
    private String pid;

    @Column(name = "PTYPE")
    private String type;

    @Column(name = "PDATA")
    @Lob
    private byte[] data;

}
