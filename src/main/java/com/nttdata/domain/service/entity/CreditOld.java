package com.nttdata.domain.service.entity;

import org.springframework.data.annotation.Id;
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
@Document(collection = "credit")
public class CreditOld {
	@Id
	private Long idCredit;
	private Long idCustomer;
	private Long idProducto;
	private Double amountCreditLimit;
}
