package com.subskart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subskart.entity.Plan;
import com.subskart.repository.PlanRepository;

@Service
public class PlanService {
	@Autowired
	public PlanRepository planRepository;

	public Plan savePlan(Plan plan) {
		return planRepository.save(plan);
	}

	public List<Plan> plans() {
		return planRepository.findAll();
	}
}
