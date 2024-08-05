package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Applicants;

@Repository
public interface RecruitRepository extends JpaRepository<Applicants, Long> {
	
}
