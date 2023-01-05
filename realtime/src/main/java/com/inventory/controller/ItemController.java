package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Item;
import com.inventory.services.ItemService;

@RestController
@CrossOrigin(origins = "http://locahost/4200")
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("/item")
	public ResponseEntity<?> addItem(@RequestBody Item item){
		itemService.additem(item);
		return (ResponseEntity<?>)ResponseEntity.ok();
	}
	
	@PutMapping("/item")
	public ResponseEntity<?> updateItem(@RequestBody Item item){
		itemService.updateItem(item);
		return (ResponseEntity<?>)ResponseEntity.ok();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteItem(@PathVariable("id") long id) {
		itemService.deleteItem(id);
		return (ResponseEntity<?>)ResponseEntity.ok();
	}
	
	@GetMapping("/item/id")
	public ResponseEntity<?> getItemById(@RequestParam("item_id") long item_id){
		Item item=itemService.getItemById(item_id);
		if(item!=null)
			return ResponseEntity.ok(item);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	@GetMapping("/item/{iname}")
	public ResponseEntity<?> getItemByName(@PathVariable("iname") String iname){
		List<Item> items=itemService.getItemByName(iname);
		if(items.size()>0)
			return ResponseEntity.ok(items);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
	@GetMapping("/items")
	public ResponseEntity<?> getAllItems(){
		List<Item> items=itemService.getAllItems();
		if(items.size()>0)
			return ResponseEntity.ok(items);
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}

}
