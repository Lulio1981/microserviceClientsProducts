package bootcamp.microservices.app.clientproducts.clientaccounts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bootcamp.microservices.app.clientproducts.documents.Account;
import reactor.core.publisher.Flux;

@FeignClient(name = "microservice-client-accounts")
public interface ClientProductFeignClientAccount {

	@GetMapping("/idClient/{idClient}")
	public Flux<Account> searchByIdClient(@PathVariable String idClient);
}
