package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inventory.entities.Item;
import com.inventory.repository.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	ItemRepo itemRepo;

	public void additem(Item item) {
		// TODO Auto-generated method stub
		itemRepo.save(item);
		
	}

	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		Item old=itemRepo.findById(item.getItemId()).get();
		old.setItemName(item.getItemName());
		old.setItemCategory(item.getItemCategory());
		old.setItemDescrition(item.getItemDescrition());
		old.setItemPrice(item.getItemPrice());
		old.setItemQuantity(item.getItemQuantity());
		itemRepo.save(old);
		}

	public void deleteItem(long id) {
		// TODO Auto-generated method stub
		itemRepo.deleteById(id);
	}

	public Item getItemById(long item_id) {
		// TODO Auto-generated method stub
		return itemRepo.findById(item_id).get();
	}

	public List<Item> getItemByName(String iname) {
		// TODO Auto-generated method stub
		return itemRepo.findByItemName(iname);
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

}
