package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
//		int truckCount = 0;
		fta.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*  Welcome to the Food Truck App!  *\n"
				+ "Please enter up to five food trucks to view a complete truck listing and to compare their ratings.\n"
				+ "If you want to enter less than five trucks, enter 'quit' when prompted for the next truck's name.");
		userEntry(sc);
		menu(sc, FoodTruck.getTruck_counter());
		sc.close();
	}
	public void userEntry(Scanner sc) {

			for (int i = 0; i < 5; i++) {
				System.out.print("\nEnter the name of a Food Truck: ");
				String nameEntry = sc.nextLine();
				
					if (nameEntry.toLowerCase().equals("quit")) { 
						if (i == 0) {
							System.out.println("Please enter at least one food truck to use the application.");
							i = -1; //resets loop counter so that user may still enter 5 trucks after the instructional prompt
							continue;
						}
						else {
						break;
						}
					}
					else {
						System.out.print("What type of food does " + nameEntry + " serve? ");
						String cuisineEntry = sc.nextLine();
						System.out.print("Please enter how you rate " + nameEntry + ", on a numeric scale "
								+ "from 1 to 5, with 5 being the best: ");
						int ratingEntry = sc.nextInt(); //add loop for verifying 1-5 entry
						sc.nextLine();
						FoodTruck newTruck = new FoodTruck(nameEntry, cuisineEntry, ratingEntry);
						fleet[i] = newTruck;
					}
			} 
	}
	public void menu(Scanner sc, int totalTruckCount) {
		boolean menuOpen = true;
		do {
			printMenu();
			int menuChoice = sc.nextInt();
			switch (menuChoice) {
			case 1:
				displayFleet(totalTruckCount);
				break;
			case 2:
				getAverage(totalTruckCount);
				break;
			case 3:
				getHighestRated(totalTruckCount);
				break;
			case 4:
				System.out.println("\nGoodbye.");
				menuOpen = false;
				break;
			default:
				System.out.println("\nInvalid entry. Please enter a number '1', '2', '3', or '4'");
				}
			sc.nextLine();
		} while(menuOpen);
			
	}
	public void printMenu() {
		System.out.println("\n*  Please enter a number 1-4, corresponding to your menu choice:     *\n"
				+ "*                                                                    *\n"
				+ "*  1. View your complete food truck listing                          *\n"
				+ "*  2. View the average rating of the submitted food trucks           *\n"
				+ "*  3. View the food truck with the highest rating among the entries  *\n"
				+ "*  4. Quit the application                                           *");
	}
	public FoodTruck[] getFleet() {
		return this.fleet;
	}
	public void displayFleet(int totalTruckCount) {
		System.out.println();
		for (int i = 0; i < totalTruckCount; i++) {
			System.out.println(getFleet()[i]);
		}
	}
	public void getAverage(int totalTruckCount) {
		System.out.println();
		double sum = fleet[0].getRating();
		for (int i = 1; i < totalTruckCount; i++) {
			sum += fleet[i].getRating();
		}
		double average = sum / (double)totalTruckCount;
		System.out.println("The average food truck rating is " + average + " (out of 5).");
	}
	
	public void getHighestRated(int totalTruckCount) {
		System.out.println();
		int max = fleet[0].getRating();
		int maxIndex = 0;
		for (int i = 1; i < totalTruckCount; i++) {
			if (max < fleet[i].getRating()) {
				max = fleet[i].getRating();
				maxIndex = i;
			}
		}
		System.out.println("Here is the highest rated food truck, with a rating of " + max + ":");
		System.out.println(getFleet()[maxIndex]);
	}
	//more methods
	//scanner lives in this class
	//park into fleet
}
