package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String cuisineType;
	private int rating;
	private static int truck_counter = 0;
	private int truckID = 0;
	
public FoodTruck() {
}

public FoodTruck(String name, String cuisineType, int rating) {
	this.name = name;
	this.cuisineType = cuisineType;
	this.rating = rating;
	truck_counter += 1;
	truckID = truck_counter;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCuisineType() {
	return cuisineType;
}
public void setCuisineType(String cuisineType) {
	this.cuisineType = cuisineType;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public static int getTruck_counter() {
	return truck_counter;
}
public static void setTruck_counter(int truck_counter) {
	FoodTruck.truck_counter = truck_counter;
}
public int getTruckID() {
	return truckID;
}
public void setTruckID(int truckID) {
	this.truckID = truckID;
}

public String toString() {
    String output = "Truck Name: " + this.name + " * Food Type: " + this.cuisineType + " * Star Rating: " + this.rating + " (out of 5) * Truck ID: " + truckID;
	    return output;
	  }
}
