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
@Table(name="Student_Registration")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Student {
	@Id
	@Column(name="SID")
	@SequenceGenerator(name="gen1",sequenceName = "SEQ_STUD",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer id;
	@NonNull
	@Column(name="NAME", length=20)
	private String name;
	@Column(name="COURSE",length=20)
	@NonNull
	private String course;
	@NonNull
	@Column(name="FEE")
	private Double fee;

}
