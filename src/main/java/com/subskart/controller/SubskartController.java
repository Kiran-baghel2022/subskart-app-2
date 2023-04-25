package com.subskart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subskart.dto.ItemPlanVenderForm;
import com.subskart.entity.Item;
import com.subskart.entity.Item_Plan_Vender_Mapping;
import com.subskart.entity.Plan;
import com.subskart.entity.Vender;
import com.subskart.service.ItemService;
import com.subskart.service.PlanService;
import com.subskart.service.VenderService;

@CrossOrigin
@RestController
public class SubskartController {

	@Autowired
	private VenderService venderService;

	@Autowired
	private ItemService itemService;

	@Autowired
	public PlanService planService;

	@PostMapping("/savevender")
	public ResponseEntity<Vender> saveVender(@RequestBody Vender vender) {
		venderService.saveVender(vender);
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
	}

	@GetMapping("/test")
	public String tes() {
		return "hello";
	}

	@GetMapping("/venders")
	public ResponseEntity<List<Vender>> venders() {
		List<Vender> venderList = venderService.venders();
		return new ResponseEntity<>(venderList, HttpStatus.OK);
	}

	@PostMapping("/saveitem")
	public ResponseEntity<Vender> saveItem(@RequestBody Item item) {
		itemService.saveItem(item);
		return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
	}

	@GetMapping("/items")
	public ResponseEntity<List<Item>> items() {
		List<Item> itemList = itemService.items();
		return new ResponseEntity<>(itemList, HttpStatus.OK);
	}

	@GetMapping("/itemsdetails")
	public ResponseEntity<ItemPlanVenderForm> itemsDetails() {
		List<Item> itemList = itemService.items();
		List<Plan> planList = planService.plans();
		ItemPlanVenderForm itemPlanVenderForm = new ItemPlanVenderForm();
		itemPlanVenderForm.setItems(itemList);
		itemPlanVenderForm.setPlans(planList);
		return new ResponseEntity<>(itemPlanVenderForm, HttpStatus.OK);
	}
}
