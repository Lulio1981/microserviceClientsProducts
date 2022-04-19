package bootcamp.microservices.app.clientproducts.clientcredits;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bootcamp.microservices.app.clientproducts.documents.ClientCredit;
import reactor.core.publisher.Mono;

@FeignClient(name = "microservice-client-credit")
public interface ClientProductFeignClientCredit {

	@GetMapping("/idClient/{idClient}")
	public Mono<ClientCredit> searchByIdClient(@PathVariable String idClient);
}
