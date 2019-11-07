public class DieClient {
    public static void main(String[] args) {
        System.out.println("welcome to the dice simulator");
        Die dice1 = new Die();
        Die dice2 = new Die();
        dice1.roll(6);
        dice2.roll(20);

        System.out.println(dice1.toString() + "\n" + dice2.toString());
    }
}
