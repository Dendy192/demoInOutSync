package com.dendy.countinoutsync.batch.service.impl;

import com.dendy.countinoutsync.batch.service.BatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractBatchServiceImpl implements BatchService {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void process() {
        log.info("Running batch");
        execute();
        log.info("Completed batch");
    }

    protected abstract void execute();
}
