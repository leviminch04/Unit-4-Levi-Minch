import java.util.Scanner;

public class BankAccountClient{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("would you like to make a new bank account (true/false)");
        boolean newAccount = scan.nextBoolean();
        if(newAccount){
            System.out.println("What is your account name? ");
            String username = scan.next();
            System.out.println("What would you like your password to be? ");
            String password = scan.next();
            System.out.println("What is your account balence");
            Double balence = scan.nextDouble();
            BankAccount userAccount = new BankAccount(username, password, balence);
            System.out.println("Would you like to access your account (true/false)?");
            boolean accessAccount = scan.nextBoolean();
            if(accessAccount){
                System.out.println("What is your username? ");
                String usernameAttempt = scan.next();
                if(usernameAttempt.equals(username)){
                    System.out.println("What is your password? ");
                    String passwordAttempt = scan.next();
                    if(passwordAttempt.equals(password)){
                        System.out.println("\n Printing info: \n" + userAccount.toString());
                        System.out.println("Would you like to add money to your account(true/false)");
                        boolean addMoney = scan.nextBoolean();
                        if(addMoney){
                            System.out.println("How much would you like to add? ");
                            double addBalence = scan.nextDouble();
                            userAccount.addBalence(addBalence);
                            userAccount.roundBalence();
                            System.out.println(userAccount.toString());

                        }
                    }
                }
                System.out.println("How many days have passed? ");
                int days = scan.nextInt();

            }
        }
        if(!newAccount){
            System.out.println("bye loser");
        }

    }
}