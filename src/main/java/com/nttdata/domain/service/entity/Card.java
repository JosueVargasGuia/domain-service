package com.nttdata.domain.service.entity;

import java.util.Date;

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
@Document(collection = "card")
public class Card {
	private Long idCard;
	private Long IdHolderAccount;
	private Long idAccount;
	private Long idSignCustAccount;
	private String cardNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date expirationDate;
	private String cvv;
	private String password;
	private Date creationDate;
	private Date dateModified;
}
//https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsonformat.htm