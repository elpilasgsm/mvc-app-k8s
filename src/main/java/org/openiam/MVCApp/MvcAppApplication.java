package org.openiam.MVCApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"org.openiam.model",
        "org.openiam.repo",
        "org.openiam",
        "org.openiam.controller"})
@EntityScan(basePackages = "org.openiam.model")
@EnableJpaRepositories(basePackages = {"org.openiam.repo"})
public class MvcAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcAppApplication.class, args);
    }

}
