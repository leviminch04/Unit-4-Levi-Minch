import java.util.Scanner;
public class RaceTrack{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Whould you like to make your own car(true/false)");
    System.out.println("If not I will run 3 atemated ones.");
    boolean run = scan.nextBoolean();
    if(run)
    {
      Car myCar = new Car("BMW", "Aventador", 1, 30, 10);

      System.out.println(myCar);
      myCar.addFuel(100);
      System.out.println(myCar);
      myCar.newDistance(20);
      System.out.println(myCar);

      Car carTwo = new Car("Subaru", "Lambo", 20, 100, 0);
      System.out.println(carTwo);
      carTwo.addFuel(20);
      System.out.println(carTwo);
      carTwo.newDistance(100);
      System.out.println(carTwo);

      Car carThree = new Car("Toyota", "truck", 70, 410, 20);
      System.out.println(carThree);
      carThree.addFuel(30.1);
      System.out.println(carThree);
      carThree.newDistance(30);
      System.out.println(carThree);

    }
    if(!run)
    {
      System.out.println("What is the make of your car?");
      String make = scan.next();
      System.out.println("What is the model of your car?");
      String model = scan.next();
      System.out.println("What is the gas milage of your car?");
      double mpg = scan.nextDouble();
      System.out.println("What is the tank size of your car?");
      double tankSize = scan.nextDouble();
      System.out.println("How far has your car been driven?");
      double driveDistance = scan.nextDouble();
      Car yourCar = new Car(make, model, mpg, tankSize, driveDistance);
      System.out.println("\n" + yourCar);
      System.out.println(make.round());
    }

  }
}
