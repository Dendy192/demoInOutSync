package com.dendy.countinoutsync.batch.componen;

import com.dendy.countinoutsync.batch.model.SyncJobConfig;
import com.dendy.countinoutsync.config.batch.SyncConfigProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SyncConfigLoader {
    private List<SyncJobConfig> jobs;

    public SyncConfigLoader(SyncConfigProperties prop, ResourceLoader loader) throws Exception {
        Resource resource = loader.getResource(prop.getConfigPath());
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> root = mapper.readValue(resource.getInputStream(), Map.class);
        this.jobs = mapper.convertValue(root.get("jobs"), mapper.getTypeFactory().constructCollectionType(List.class, SyncJobConfig.class));

    }

    public List<SyncJobConfig> getJobs() {
        return jobs;
    }
}
