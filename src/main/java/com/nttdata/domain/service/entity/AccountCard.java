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
@Document(collection="account-card")
public class AccountCard {
private Long idAccountCard;
private Long idCard;
private Long idAccount;
private Long  sequence;
private Boolean isMainAccount;
private TypeAccount typeAccount;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss") 
private Date creationDate;
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
private Date dateModified;
}
