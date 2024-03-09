package br.com.gomes.bankclienttransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
public class BankClientTransactionApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/bank-client-transaction");
		SpringApplication.run(BankClientTransactionApplication.class, args);
	}

}
