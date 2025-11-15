package com.dendy.countinoutsync.mysql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "MSTGATE")
public class MSTGATE {
    @Id
    @Column(name = "MSTID")
    private String id;

    @Column(name = "MSTLOKASI")
    private String name;

}
