package bootcamp.microservices.app.clientproducts.documents;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
public class AccountInformation implements Serializable {

	private static final long serialVersionUID = -5990445464393472202L;

	private Flux<Account> account;

	private Mono<Double> balanceCard;

}
