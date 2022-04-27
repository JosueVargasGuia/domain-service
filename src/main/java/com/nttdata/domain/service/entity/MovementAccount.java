package com.nttdata.domain.service.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Document(collection = "movements_accounts")
public class MovementAccount {
	@Id
	private Long idMovementAccount;
	private Long idBankAccount;
	private Long idCustomer;
	private Double amount;
	private Date dateMovementAccount;
	private TypeMovementAccount typeMovementAccount;
	double commissionForTransaction;
	private Date creationDate;
	private Date dateModified;
}
