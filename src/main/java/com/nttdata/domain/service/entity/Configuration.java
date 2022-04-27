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
@Document(collection = "configuration")
public class Configuration {
	@Id
	private Long idConfiguration;
	private Double costMaintenance;// Costo de mantenimiento
	private Integer quantityMovement;// Total de movimientos
	private String specificDate;
	// TypeMovement TypeMovement;//tipo
	private Integer quantityCredit;// Cantidad de movimientos permitidos, si solo permite un dia de moviento se
						// especifica fecha
	private Double minOpeningAmount;
	private Double minDayAverageAmount;
	private Double transactionFee;
	private Date creationDate;
	private Date dateModified;
 
	
	
}
