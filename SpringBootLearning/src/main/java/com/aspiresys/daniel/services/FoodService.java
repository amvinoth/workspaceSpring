/**
 * 
 */
package com.aspiresys.daniel.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aspiresys.daniel.pojo.Food;

/**
 * @author ashwin.daniel
 *
 */
@Service
public class FoodService {

	private List<Food> foods = Arrays.asList(new Food("Dosa", 40, "Dosa description", "Breakfast"),
			new Food("Rice", 50, "Rice description", "Lunch"), new Food("Roti", 60, "Roti description", "Dinner"));

	/**
	 * 
	 */
	public FoodService() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

	public List<Food> getAllFood() {
		return foods;
	}

	public Food getFood(String category) {
		if (foods.stream().filter(t -> t.getCategory().equals(category)).findFirst().isPresent())
			return foods.stream().filter(t -> t.getCategory().equals(category)).findFirst().get();
		else
			return new Food("Not Found",0,"N/A","Category not available");
	}

	public void addFood(Food food) {
		foods.add(food);
	}
}
