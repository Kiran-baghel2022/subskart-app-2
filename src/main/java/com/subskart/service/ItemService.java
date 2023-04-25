package com.subskart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subskart.entity.Item;
import com.subskart.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	public ItemRepository itemRepository;

	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}
	
	public List<Item> items(){
		return itemRepository.findAll();
	}

}
