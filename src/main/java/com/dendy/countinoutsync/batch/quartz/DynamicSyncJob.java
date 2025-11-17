package com.dendy.countinoutsync.batch.quartz;

import com.dendy.countinoutsync.batch.componen.SyncCoordinator;
import com.dendy.countinoutsync.batch.service.BatchService;
import lombok.AllArgsConstructor;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DynamicSyncJob extends QuartzJobBean {

    private final SyncCoordinator syncCoordinator;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        String serviceName = context.getMergedJobDataMap().getString("service");
        System.out.println("INI di DYnamic"+serviceName);
        BatchService batchService = syncCoordinator.getService(serviceName);
        if (batchService != null) {
            batchService.process();
        }
    }
}
