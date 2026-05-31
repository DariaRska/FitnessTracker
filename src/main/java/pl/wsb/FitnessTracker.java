package pl.wsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "pl.wsb.fitnesstracker")
@EnableJpaRepositories(basePackages = "pl.wsb.fitnesstracker")
@SpringBootApplication
@ComponentScan(basePackages = "pl.wsb.fitnesstracker")
public class FitnessTracker {

    public static void main(String[] args) {
        SpringApplication.run(FitnessTracker.class, args);
    }

}
