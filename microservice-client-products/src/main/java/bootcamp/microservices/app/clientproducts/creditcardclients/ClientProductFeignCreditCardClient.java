package bootcamp.microservices.app.clientproducts.creditcardclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bootcamp.microservices.app.clientproducts.documents.ClientCreditCard;
import reactor.core.publisher.Mono;

@FeignClient(name = "microservice-credit-card-clients")
public interface ClientProductFeignCreditCardClient {

	@GetMapping("/idClient/{idClient}")
	public Mono<ClientCreditCard> searchByIdClient(@PathVariable String idClient);

}
