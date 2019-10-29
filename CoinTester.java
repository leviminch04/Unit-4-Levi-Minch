//Creates instances of the coin class and tests their attributes and behaviors
public class CoinTester {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        int headsTotal = 0;
        int tailsTotal = 0;
        for (int i = 0; i <= 10; i++){
          coin1.flip();
          if (coin1.equals(HEADS))
            headsTotal++;
          if (coin1.equals(TAILS))
            tailsTotal++;
        }
        System.out.println("Number of heads: " + headsTotal);
        System.out.println("Number of tails: " + tailsTotal);



    }
}
