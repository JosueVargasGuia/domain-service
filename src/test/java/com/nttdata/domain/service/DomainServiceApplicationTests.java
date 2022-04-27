package com.nttdata.domain.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nttdata.domain.service.entity.BankAccounts;
import com.nttdata.domain.service.entity.CreditAccount;

@SpringBootTest
class DomainServiceApplicationTests {

	@Test
	void contextLoads() {
		BankAccounts accounts=new BankAccounts();
		accounts.setAccountNumber(null);
		accounts.setCreationDate(null);
		accounts.setDateModified(null);
		accounts.setIdAccount(null);
		accounts.setIdBankAccount(null);
		accounts.setIdCustomer(null);
		accounts.setIdProducto(null);
		accounts.setTypeOfCurrency(null);
		CreditAccount creditAccount=new CreditAccount();
		creditAccount.setAccountNumber(null);
		creditAccount.setAmountCreditLimit(0);
		creditAccount.setCreationDate(null);
		creditAccount.setDateModified(null);
		creditAccount.setIdAccount(null);
		creditAccount.setIdCreditAccount(null);
		creditAccount.setIdCustomer(null);
		creditAccount.setIdProducto(null);
		creditAccount.setTypeOfCurrency(null);
		
	}

}
