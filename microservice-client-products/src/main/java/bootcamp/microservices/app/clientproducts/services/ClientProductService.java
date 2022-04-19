package bootcamp.microservices.app.clientproducts.services;

import bootcamp.microservices.app.clientproducts.documents.ClientProduct;
import reactor.core.publisher.Mono;

public interface ClientProductService {

	public Mono<ClientProduct> searchProductsByClient(String idClient);

}
