package com.dendy.countinoutsync.batch.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SyncJobConfig {
    private String name;
    private String cron;
    private int pageSize;
    private String service;
    private String model;
}
