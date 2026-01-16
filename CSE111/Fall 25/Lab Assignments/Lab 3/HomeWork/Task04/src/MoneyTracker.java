public class MoneyTracker{
    public String name;
    public double balance;


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
    }

    public void expense(int expense){
        balance -= (expense*1.0);
        System.out.println("Balance Updated");
    }
}
