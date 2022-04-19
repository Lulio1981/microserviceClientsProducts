package bootcamp.microservices.app.clientproducts.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.microservices.app.clientproducts.clientaccounts.ClientProductFeignClientAccount;
import bootcamp.microservices.app.clientproducts.clientcredits.ClientProductFeignClientCredit;
import bootcamp.microservices.app.clientproducts.clientmovements.ClientProductFeignClientMovement;
import bootcamp.microservices.app.clientproducts.creditcardclients.ClientProductFeignCreditCardClient;
import bootcamp.microservices.app.clientproducts.documents.Account;
import bootcamp.microservices.app.clientproducts.documents.AccountInformation;
import bootcamp.microservices.app.clientproducts.documents.ClientCredit;
import bootcamp.microservices.app.clientproducts.documents.ClientCreditCard;
import bootcamp.microservices.app.clientproducts.documents.CreditCardInformation;
import bootcamp.microservices.app.clientproducts.documents.CreditInformation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CreateBalances {

	@Autowired
	private ClientProductFeignClientAccount clientProductFeignClientAccount;

	@Autowired
	private ClientProductFeignClientMovement clientProductFeignClientMovement;

	@Autowired
	private ClientProductFeignClientCredit clientProductFeignClientCredit;

	@Autowired
	private ClientProductFeignCreditCardClient clientProductFeignCreditCardClient;

	public Mono<AccountInformation> getAccountInformation(String idClient) {
		Flux<Account> accountList = clientProductFeignClientAccount.searchByIdClient(idClient);
		Mono<Double> balance = clientProductFeignClientMovement
				.balanceProductCalculate(accountList.blockFirst().getId());
		return Mono.just(new AccountInformation(accountList, balance));
	}

	public Mono<CreditInformation> getCreditInformation(String idClient) {
		Mono<ClientCredit> creditList = clientProductFeignClientCredit.searchByIdClient(idClient);
		Mono<Double> balance = clientProductFeignClientMovement.balanceProductCalculate(creditList.block().getId());
		return Mono.just(new CreditInformation(creditList, balance));
	}

	public Mono<CreditCardInformation> getCreditCardInformation(String idClient) {
		Mono<ClientCreditCard> creditCardList = clientProductFeignCreditCardClient.searchByIdClient(idClient);
		Mono<Double> balance = clientProductFeignClientMovement.balanceProductCalculate(creditCardList.block().getId());
		return Mono.just(new CreditCardInformation(creditCardList, balance));
	}

}
