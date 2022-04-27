package com.nttdata.domain.service.entity;

import java.util.Date;

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
@Document(collection = "holder-accounts")
public class HolderAccount {
	
	@Id
	private Long idHolderAccount;
	private Long idCustomer;
	private Long idAccount;
	private Date creationDate;
	private Date dateModified; 
 
}
