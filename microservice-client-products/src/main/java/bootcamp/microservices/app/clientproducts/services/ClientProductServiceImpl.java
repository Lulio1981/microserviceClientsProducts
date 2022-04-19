package bootcamp.microservices.app.clientproducts.services;

import org.springframework.beans.factory.annotation.Autowired;

import bootcamp.microservices.app.clientproducts.documents.ClientProduct;
import bootcamp.microservices.app.clientproducts.exceptions.customs.CustomNotFoundException;
import bootcamp.microservices.app.clientproducts.utils.CreateBalances;
import reactor.core.publisher.Mono;

public class ClientProductServiceImpl implements ClientProductService {

	@Autowired
	private CreateBalances createBalances;

	@Override
	public Mono<ClientProduct> searchProductsByClient(String idClient) {
		return Mono.just(new ClientProduct(createBalances.getAccountInformation(idClient),
				createBalances.getCreditCardInformation(idClient), createBalances.getCreditInformation(idClient)))
				.switchIfEmpty(Mono.error(new CustomNotFoundException("ClientMovement not found")));
	}

}
