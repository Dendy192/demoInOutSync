package com.dendy.countinoutsync.batch.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SyncConfig {
    private List<SyncJobConfig> jobs;
}
