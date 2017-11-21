package com.aspiresys.daniel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.daniel.pojo.Food;
import com.aspiresys.daniel.services.FoodService;

@RestController
public class MyController {

	@Autowired
	private FoodService foodservice;

	@RequestMapping("/topic")
	public String sayTopic() {
		return "All Topics..";
	}

	@RequestMapping("/menus")
	public List<Food> getAllMenus() {
		return foodservice.getAllFood();
	}

	@RequestMapping("/menus/{category}")
	public Food getMenu(@PathVariable String category) {
		return foodservice.getFood(category);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/menus")
	public void addFood(@RequestBody Food food) {
		foodservice.addFood(food);
	}
}
