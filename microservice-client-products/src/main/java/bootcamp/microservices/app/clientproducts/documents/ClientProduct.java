package bootcamp.microservices.app.clientproducts.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Data
public class ClientProduct {

	private Mono<AccountInformation> accountList;

	private Mono<CreditCardInformation> creditCardList;

	private Mono<CreditInformation> creditList;

}
