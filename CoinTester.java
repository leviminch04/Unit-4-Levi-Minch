//Creates instances of the coin class and tests their attributes and behaviors
public class CoinTester {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        int headsTotal = 0;
        int coinFlips = 1000;
        for (int i = 0; i < coinFlips; i++){
          coin1.flip();
          if (coin1.isHeads())
            headsTotal++;
        }
        System.out.println("Number of heads: " + headsTotal);

    }
}
