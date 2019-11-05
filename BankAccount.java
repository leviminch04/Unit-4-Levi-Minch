public class BankAccount{
    private String password;
    private String username;
    private double balence;
    public double interests;
    public int accountNumber;
    private double ammountInterest;
    private double ammountFromInterest;

    public BankAccount(String newUsername, String newPassword, double newBalence){
        password = newUsername;
        username = newPassword;
        accountNumber = (int) (Math.random()*1000000) + 10000000;
        balence = Math.round(newBalence*100) / 100;
    }

    public double getBalence() {
        return balence;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public void addBalence(double addBalence){
        balence += addBalence;
    }
    public void roundBalence(){
        balence = Math.round(balence*100) / 100;
    }
    public void setInterests(double interestsRate){
        ammountInterest = interestsRate;
    }
    public void iterestsCalculator(int days){
        ammountFromInterest = (balence)(ammountInterest)(days);
        ammountFromInterest = Math.round(ammountFromInterest*100) / 100;
        balence += ammountFromInterest;
    }
    public String toString(){
        String accountInfo = "";
        accountInfo += "Username: " + username + "\n";
        accountInfo += "Password: " + password + "\n";
        accountInfo += "Account Number: " + accountNumber + "\n";
        accountInfo += "Balence: " + balence + "\n";
        return accountInfo;
    }
}