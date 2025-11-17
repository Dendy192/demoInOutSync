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
@Table(name = "MSTPERUSH")
public class MSTPERUSH {
    @Id
    @Column(name = "MSTNAME")
    private String name;

    @Column(name = "MSTACTIVE")
    private int status;

}
