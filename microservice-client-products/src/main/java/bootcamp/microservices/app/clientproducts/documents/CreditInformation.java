package bootcamp.microservices.app.clientproducts.documents;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
public class CreditInformation implements Serializable {

	private static final long serialVersionUID = 3219572729666374617L;

	private Mono<ClientCredit> clientCredit;

	private Mono<Double> balanceCard;

}
