package com.subskart.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.subskart.entity.Item;
import com.subskart.entity.Plan;
import com.subskart.entity.Vender;

import lombok.Data;

@Data
@Component
public class ItemPlanVenderForm {
	private List<Item> items;
	private List<Plan> plans;
	private Vender vender;
	private Item item;
	private Plan plan;
}
