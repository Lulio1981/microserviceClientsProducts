package bootcamp.microservices.app.clientproducts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.microservices.app.clientproducts.documents.ClientProduct;
import bootcamp.microservices.app.clientproducts.services.ClientProductService;
import reactor.core.publisher.Mono;

@RestController
public class ClientProductController {
	
	@Autowired
	private ClientProductService service;
	
	@GetMapping("/idClient/{idClient}")
	public Mono<ClientProduct> searchProductsByIdClient(@PathVariable String idClient) {
		return service.searchProductsByClient(idClient);
	}

}
