package com.dendy.countinoutsync.batch.quartz;

import com.dendy.countinoutsync.batch.componen.SyncConfigLoader;
import com.dendy.countinoutsync.batch.model.SyncJobConfig;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.quartz.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SchedulerStarter {
//public class SchedulerStarter implements ApplicationListener<ContextRefreshedEvent> {

    private final Scheduler scheduler;

    private final SyncConfigLoader configLoader;

    //    private boolean initialized = false;
    @PostConstruct
    public void scheduleJob() throws Exception {
        System.out.println("INI di scheduleJob");
        System.out.println("INI di scheduleJob " + configLoader.getJobs());
        for (SyncJobConfig syncJobConfig : configLoader.getJobs()) {
            JobDataMap dataMap = new JobDataMap();
            dataMap.put("service", syncJobConfig.getService());
            dataMap.put("model", syncJobConfig.getModel());
            dataMap.put("pageSize", syncJobConfig.getPageSize());
            JobKey jobKey = new JobKey("job-" + syncJobConfig.getName());
            JobDetail jobDetail = JobBuilder.newJob(DynamicSyncJob.class)
                    .withIdentity(jobKey)
                    .usingJobData(dataMap)
                    .storeDurably()
                    .build();
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(syncJobConfig.getCron());
            Trigger trigger = TriggerBuilder.newTrigger()
                    .forJob(jobDetail)
                    .withIdentity("trigger-" + syncJobConfig.getName())
                    .withSchedule(cronScheduleBuilder).build();
            if (scheduler.checkExists(jobDetail.getKey())) {
                scheduler.deleteJob(jobDetail.getKey());
            }
            scheduler.scheduleJob(jobDetail, trigger);
        }
    }

//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        if (initialized) return;
//        initialized = true;
//
//        try {
//            System.out.println("Scheduler started? " + scheduler.isStarted());
//            scheduleJob();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
