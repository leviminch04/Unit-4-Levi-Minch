public class SixtyNine {
    public static void main(String[] args) {
        boolean running = true;
        int sixtyNine;
        int runValue = 0;
        while(running){
            runValue++;
            sixtyNine = (int) (Math.random()*1000000000) + 1;
            System.out.println(sixtyNine);
            if(sixtyNine == 42069){
                running = false;
                System.out.println("sixtynine = 42069");
                System.out.println(sixtyNine);
                System.out.println("It took: " + runValue + " to get 42069");
            }
        }
    }

}
