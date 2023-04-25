package com.subskart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long itemId;
	private String itemName;
	private Double price=0.0;
}
