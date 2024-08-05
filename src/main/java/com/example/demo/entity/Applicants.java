package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name= "applicants", schema = "appl")
public class Applicants {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appl_seq")
    @SequenceGenerator(name = "appl_seq", sequenceName = "appl.appl_seq", allocationSize = 1)
	@Column(name = "id")
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
		
	private String introduction;
	
	@Column(name = "agree")
	private boolean agree;

}
