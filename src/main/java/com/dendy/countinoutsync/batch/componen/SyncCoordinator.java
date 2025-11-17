package com.dendy.countinoutsync.batch.componen;

import com.dendy.countinoutsync.batch.service.BatchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SyncCoordinator {

    private final ApplicationContext ctx;

    public BatchService getService(String beanName) {
        Object bean = ctx.getBean(beanName);

        if (!(bean instanceof BatchService)) {
            throw new IllegalArgumentException("Bean '" + beanName +
                    "' does not implement BatchService");
        }

        return (BatchService) bean;
    }

    public void runSync(String beanName, String tableName, int pageSize) {
        Object bean = ctx.getBean(beanName);

    }
}
