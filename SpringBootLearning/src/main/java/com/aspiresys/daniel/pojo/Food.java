/**
 * 
 */
package com.aspiresys.daniel.pojo;

/**
 * @author ashwin.daniel
 *
 */
public class Food {

	/**
	 * @param name
	 * @param price
	 * @param description
	 * @param category
	 */

	private String name;
	private double price;
	private String description;
	private String category;

	public Food() {
	}

	public Food(String name, double price, String description, String category) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", description=" + description + ", category=" + category
				+ "]";
	}

}
