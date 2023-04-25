package com.subskart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Item_Plan_Vender_Mapping {

	@Id
	@GeneratedValue
	private Integer itemPlanVenderdetailsId;
	@OneToOne
	@JoinColumn(name = "item_id", referencedColumnName = "itemId")
	private Item item;
	@OneToOne
	@JoinColumn(name = "plan_id", referencedColumnName = "planId")
	private Plan plan;
	@OneToOne
	@JoinColumn(name = "vender_id", referencedColumnName = "venderId")
	private Vender vender;
}
