package pl.hack4girlz.earner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.hack4girlz.earner"})
@EnableJpaRepositories(basePackages = {"pl.hack4girlz.earner.model.repository"})
public class EarnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarnerApplication.class, args);
    }

}
