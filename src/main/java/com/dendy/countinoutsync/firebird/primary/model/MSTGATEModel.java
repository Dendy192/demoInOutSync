package com.dendy.countinoutsync.firebird.primary.model;

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
public class MSTGATEModel {
    @Id
    @Column(name = "MSTID")
    private String id;

    @Column(name = "MSTLOKASI")
    private String name;


}
