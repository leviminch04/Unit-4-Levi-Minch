public class RaceTrack{
  public static void main(String[] args) {
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
}
