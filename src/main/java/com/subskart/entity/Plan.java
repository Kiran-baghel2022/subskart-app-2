package com.subskart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Plan {
	
	@Id
	@GeneratedValue
	private Integer planId;
	private String planName;
	private int planCode;
}
