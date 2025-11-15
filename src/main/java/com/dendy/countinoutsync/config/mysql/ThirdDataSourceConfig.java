package com.dendy.countinoutsync.config.mysql;

import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(basePackages = "com.dendy.countinoutsync.mysql.service", entityManagerFactoryRef = "thirdEntityManagerFactory", transactionManagerRef = "thirdTransactionManager")
@RequiredArgsConstructor
public class ThirdDataSourceConfig {

    private final Environment env;

    @Bean(name = "thirdDataSource")
    public DataSource thirdDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.third.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.datasource.third.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.third.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.third.password"));
        return dataSource;
    }

    @Bean(name = "thirdEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean thirdEntityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("thirdDataSource") DataSource dataSource) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.third.properties.hibernate.dialect"));
        return builder
                .dataSource(dataSource)
                .packages("com.dendy.countinoutsync.mysql.model")
                .persistenceUnit("third")
                .properties(properties)
                .build();
    }

    @Bean(name = "thirdTransactionManager")
    public PlatformTransactionManager thirdTransactionManager(@Qualifier("thirdEntityManagerFactory") EntityManagerFactory thirdEntityManagerFactory) {
        return new JpaTransactionManager(thirdEntityManagerFactory);
    }
}
