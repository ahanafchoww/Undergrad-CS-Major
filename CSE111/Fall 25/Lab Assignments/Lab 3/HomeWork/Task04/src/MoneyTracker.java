public class MoneyTracker{
    public String name;
    public double balance;
    public double lastSpent;
    public double lastAdded;


    public String info(){
        return "Name: " + name + "\n" + "Current Balance: " + balance;
    }

    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }

    public void createTracker(String name){
        this.name = name;
        balance = 1.0;
    }
    public void income(int income){
        balance += (income * 1.0);
        System.out.println("Balance Updated");
        lastAdded = income;
    }

    public void expense(int expense){
        if (balance>expense) {
            balance -= (expense * 1.0);
            System.out.println("Balance Updated");
            lastSpent = expense;
        }
        else if (balance<expense){
            System.out.println("Not enough balance.");
        }
        else {
            System.out.println("You're broke!");
        }
    }

    public void showHistory(){
        System.out.println ("Last added: " + lastAdded + "\n" +
                "Last spent: " + lastSpent);
    }
}
