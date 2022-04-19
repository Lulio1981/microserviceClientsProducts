package bootcamp.microservices.app.clientproducts.clientmovements;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import reactor.core.publisher.Mono;

@FeignClient(name = "microservice-client-credit")
public interface ClientProductFeignClientMovement {

	@GetMapping("/idProduct/{idProduct}")
	public Mono<Double> balanceProductCalculate(@PathVariable String idProduct);
}
