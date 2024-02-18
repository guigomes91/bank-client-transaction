package br.com.gomes.bankclienttransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class BankClientTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankClientTransactionApplication.class, args);
	}

}
