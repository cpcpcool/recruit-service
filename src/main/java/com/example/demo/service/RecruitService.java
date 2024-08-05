package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Applicants;
import com.example.demo.repository.RecruitRepository;

@Service
public class RecruitService {

	@Autowired
	private RecruitRepository recruitRepository;
	
	public List<Applicants> findAll() {
		return recruitRepository.findAll();
	}
	
	public void insert(Applicants applicants) {
		recruitRepository.save(applicants);
	}
	
}
