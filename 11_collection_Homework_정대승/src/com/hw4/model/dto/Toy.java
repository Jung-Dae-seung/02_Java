package com.hw4.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	private String name;
	private int age;
	private int price;
	private String color;
	private int year;
	private Set<String> ingredient;
	
	public Toy() {}
	
	public Toy(String name, int age, int price, String color, int year, Set<String> ingredient) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.year = year;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<String> getIngredient() {
		return ingredient;
	}

	public void setIngredient(Set<String> ingredient) {
		this.ingredient = ingredient;
	}


	@Override
	public String toString() {
		
		String ingre = String.join(", ", ingredient);
		
		return "이름 : " + name 
				+ " / 가격 : " + price 
				+ " / 색상 : " + color
				+ " / 사용가능연령 : " + age 
				+ " / 제조년월일 : " + year 
				+ " / 재료 : " + ingre;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, color, ingredient, name, price, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(ingredient, other.ingredient)
				&& Objects.equals(name, other.name) && price == other.price && year == other.year;
	}
	
	
}
