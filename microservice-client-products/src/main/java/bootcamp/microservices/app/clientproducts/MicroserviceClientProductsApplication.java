package bootcamp.microservices.app.clientproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroserviceClientProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientProductsApplication.class, args);
	}

}
