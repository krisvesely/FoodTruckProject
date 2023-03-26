# FoodTruckProject

## Overview
Allows users to enter a name, food type, and rating for up to five food trucks. Upon entering food truck data, 
users can to view a complete listing of the food trucks with associated food type and rating, view the average rating
for the trucks, and find the truck(s) with the highest rating, until they command the application to quit.

## Technologies Used
- Java OOP
- Eclipse
- Git

## Lessons Learned
- Defined a food truck class with non-static fields for states that vary among the objects,
 and a static field to count the number of instances.
- Encapsulated the class fields, requiring methods that return object states for visibility outside of the food truck class.
- Instantiates an object for each food truck entered by the user, populating constructor parameters with the user inputs for name, food type, and rating. 
- Initialized an array into which each food truck is indexed as an element.
- Includes do-while loops that contain a switch and if/else conditions to screen the validity of user entries before proceeding.
- For loops refer to each instance within the array, to determine the average and highest ratings. 
- Allows for the output of multiple trucks when more than one truck are tied with the highest rating.