/*
A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

*/



public class Car {
    //makes of the Car
    private String make;
    private double mpg;      //miles per gallon
    private String model;
    private double tankSize; //in gallons
    double fuel;     //in gallons
    double carDistance;
    double fuelUsed;

    //construcotor for the car, initializes the instance variables for the Car.
    public Car(String carMake, String carModel, double carMpg, double carTankSize, double carDroveDistance){
      make = carMake;
      model = carModel;
      mpg = carMpg;
      tankSize = carTankSize;
      carDistance = carDroveDistance;
      fuel = tankSize - (carDistance / mpg);
    }
    public String getMake(){
      return make;
    }
    public String getModel(){
      return model;
    }
    public double getMpg(){
      return mpg;
    }
    public double getTankSize(){
      return tankSize;
    }
    public void setCarDistance(double newDistance){
      carDistance = newDistance;
    }
    public double getCarDistance(){
      return carDistance;
    }
    public double getFuel(){
      return fuel;
    }
    public double newDistance(double addDistance){
      fuel = fuel - ((carDistance + addDistance) / mpg);
      carDistance += addDistance;
      return carDistance;
    }

    public String toString(){
      String result = "";
      result += "Make: " + make + "\n";
      result += "Model: " + model + "\n";
      result += "MPG: " + mpg + "\n";
      result += "Tank Size: " + tankSize + "\n";
      result += "Fuel: " + fuel + "\n";
      result += "Distance: " + carDistance + "\n";
      return result;
    }

    public double addFuel(double fuelAmount){
        fuel += fuelAmount;
        if (fuel > tankSize){
          fuel = tankSize;
        }
        return  fuel;
    }
}
