Problem Statement: 
Design a parking lot management system that accommodates motorcycles, cars, and buses, utilizing multiple levels with rows of parking spots of varying sizes.
Specifications:
The parking lot has multiple levels, with each level containing multiple rows of spots.
Vehicles that can be parked include motorcycles, cars, and buses.
Parking spots are categorized into motorcycle spots, compact spots (for cars), and large spots (for cars and buses).
Motorcycles can park in any available spot.
Cars can be parked in either a single compact spot or a single large spot.
Buses require five consecutive large spots within the same row to park and cannot occupy smaller spots.
Implement an abstract class Vehicle, serving as the base class for Car, Bus, and Motorcycle, each inheriting from Vehicle.
Utilize a class ParkingSpot with a member variable indicating spot size to manage and allocate parking spots effectively.
Task: Develop a parking lot management system that:
Allocates spots to vehicles based on their size and availability.
Handles scenarios where vehicles enter, park, or leave the parking lot.
Ensures efficient utilization of space by optimizing spot allocation for different vehicle types.
Manages multiple levels and rows of parking spots.
The system should offer functionalities such as:
Parking a vehicle in an available spot.
Removing a vehicle from a spot upon exit.
Providing information about available spots.
Handling edge cases and optimizing space usage efficiently.
This parking lot management system should be capable of dynamically managing vehicles of different sizes in a multi-level, multi-row parking environment, ensuring efficient utilization of space while accommodating vehicles of varying sizes and types.
