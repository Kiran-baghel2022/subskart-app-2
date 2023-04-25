package com.subskart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subskart.entity.Vender;
import com.subskart.repository.VenderRepository;

@Service
public class VenderService {
	@Autowired
	public VenderRepository venderRepository;

	public List<Vender> venders() {
		return venderRepository.findAll();
	}

	public Vender saveVender(Vender vender) {
		return venderRepository.save(vender);
	}

}
