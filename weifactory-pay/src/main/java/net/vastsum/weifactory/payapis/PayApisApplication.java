package net.vastsum.weifactory.payapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PayApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayApisApplication.class, args);
	}
}
