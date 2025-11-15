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
@Table(name = "SYSACCESS")
public class SYSACCES {
    @Id
    @Column(name = "USID")
    private String id;

    @Column(name = "USNAME")
    private String username;


}
