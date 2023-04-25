package com.subskart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Vender {
	@Id
	@GeneratedValue
	private int venderId;
	private String venderName;
}
