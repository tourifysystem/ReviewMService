package bt.edu.gcit.reviewmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories

public class ReviewmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewmicroserviceApplication.class, args);
	}

}
