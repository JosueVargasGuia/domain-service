package com.nttdata.domain.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class CreditAccount extends Account {
	private Long idCreditAccount;
	private Long idProducto;
	private Double amountCreditLimit;
	private Long idAccount;
}
