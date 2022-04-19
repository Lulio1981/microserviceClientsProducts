package bootcamp.microservices.app.clientproducts.documents;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
public class CreditCardInformation implements Serializable {

	private static final long serialVersionUID = -2606580103713386913L;

	private Mono<ClientCreditCard> clientCreditCard;

	private Mono<Double> balanceCard;

}
