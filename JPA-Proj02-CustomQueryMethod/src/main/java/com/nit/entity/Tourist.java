package com.nit.entity;

import jakarta.persistence.Column;
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
@Table(name="JPA_TOURIST")
@NoArgsConstructor
@RequiredArgsConstructor
public class Tourist {
	
	@Id
	@SequenceGenerator(name="gen2",sequenceName="Tourist_SEQ",allocationSize=1,initialValue = 1001)
	@GeneratedValue(generator="gen2",strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@NonNull
	@Column(name="Tourist_Name")
	private String name;
	@NonNull
	@Column(name="Country_Name")
	private String country;
	@NonNull
	@Column(name="VistingPlace")
	private String wantToVist;
}
