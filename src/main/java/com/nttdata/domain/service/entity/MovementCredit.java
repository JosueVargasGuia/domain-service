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
@Document(collection = "movement_credit")
public class MovementCredit {
	@Id
	private Long IdMovementCredit;
	private Long idCreditAccount;
	private double amount;
	private Date dateMovement;
	private TypeMovementCredit typeMovementCredit;
	double commissionForTransaction;
	private Date creationDate;
	private Date dateModified;

}
