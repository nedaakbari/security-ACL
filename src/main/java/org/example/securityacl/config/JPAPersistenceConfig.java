package org.example.securityacl.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "org.example.securityacl.persistence.dao")
@PropertySource("classpath:application.properties")
@EntityScan(basePackages = {"org.example.securityacl.persistence.entity"})
public class JPAPersistenceConfig {

}