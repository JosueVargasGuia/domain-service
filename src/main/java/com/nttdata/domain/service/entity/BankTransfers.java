package com.nttdata.domain.service.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document(collection = "bank-transfers")
public class BankTransfers {
	private Long idBankTransfers;
	private Long idBankAccount;
	private Long idCreditAccount;
	private TypeTransfer typeTransfer;
	private Double amount;
	private String accountNumber;
	private Date operationDate;
	private String interbankAccountCode;
	private Date creationDate;
	private Date dateModified;
}
