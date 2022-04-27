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
@Document(collection = "account")
public class Account {
	@Id
	private Long idAccount;
	private Long idCustomer;
	private typeOfCurrency typeOfCurrency;
	private String accountNumber;	
	private Date creationDate;
	private Date dateModified;
}
