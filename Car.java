/*
A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

*/



public class Car {
  public static void main(String[] args) {
    //makes of the Car
    private String make;
    private double mpg;      //miles per gallon
    private String model;
    private double tankSize; //in gallons
    private double fuel;     //in gallons
    private double carDistance;

    //construcotor for the car, initializes the instance variables for the Car.
    public Car(String carMake, String carModel, double carMpg, double carTankSize){
      make = carMake;
      model = carModel;
      mpg = carMpg;
      tankSize = carTankeSize;
      fuel = tankSize;
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

    public String toString(){
      String result = "";
      result += "Make: " + make + "\n";
      result += "Model: " + model + "\n";
      result += "MPG: " + mpg + "\n";

    }


  }
}
