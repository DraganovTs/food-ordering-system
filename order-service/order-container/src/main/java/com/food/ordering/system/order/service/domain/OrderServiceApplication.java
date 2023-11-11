package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.kafka.config.data.KafkaConfigData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.food.ordering.system.order.service.dataaccess",
        "com.food.ordering.system.dataaccess"})
@EntityScan(basePackages = {"com.food.ordering.system.order.service.dataaccess",
        "com.food.ordering.system.dataaccess"})
@SpringBootApplication(scanBasePackages = {"com.food.ordering.system"})
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
