public class RaceTrack{
  public static void main(String[] args) {
    Car myCar = new Car("BMW", "Aventador", 100, 30);

    System.out.println(myCar);

    myCar.carDistance(20);
    myCar.getMake();


  }
}
