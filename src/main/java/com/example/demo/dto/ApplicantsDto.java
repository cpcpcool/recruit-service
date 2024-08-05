package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ApplicantsDto {
	
	
	private String name;
	private String email;
	private Integer phone;
	private String introduction;
	private boolean agree;
	
}
