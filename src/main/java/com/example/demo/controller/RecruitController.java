package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Applicants;
import com.example.demo.service.RecruitService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class RecruitController {

	@Autowired
	private RecruitService recruitService;
		
	@GetMapping("/api/recruitList")
	public List<Applicants> findList() {
		return recruitService.findAll();
	}
	
//	@PostMapping("/api/recruitment")
//	public ResponseEntity<String> insert(@RequestBody Applicants formData) {
//		recruitService.insert(formData);
//		return ResponseEntity.ok("form submit success!");
//	}
	
	@PostMapping("/api/recruitment")
    public ResponseEntity<String> insert(@RequestBody Applicants formData) {
        try {
            recruitService.insert(formData);
            log.info(formData.toString());
            return ResponseEntity.ok("form submit success!");
        } catch (Exception e) {
            e.printStackTrace();
            log.info(formData.toString());
            return ResponseEntity.status(500).body("Server error occurred");
        }
    }
}
