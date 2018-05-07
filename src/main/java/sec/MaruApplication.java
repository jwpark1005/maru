package sec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@SpringBootApplication
// @SpringBootApplication = @Configuration ,@EnableAutoConfiguration,@ComponentScan
@EnableAutoConfiguration()
@ComponentScan(basePackages = {"sec"})
public class MaruApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaruApplication.class, args);
    }

}
