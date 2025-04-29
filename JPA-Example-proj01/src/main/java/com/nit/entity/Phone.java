package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name="JPA_Phone2")
@NoArgsConstructor
public class Phone {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName="SEQ_Phone3",initialValue =1,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer id;
	
		@NonNull
	private String name;
		@NonNull
		private String company;
		@NonNull
		private Double price;

}
