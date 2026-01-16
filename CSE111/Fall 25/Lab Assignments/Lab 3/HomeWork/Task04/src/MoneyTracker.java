public class MoneyTracker{
    public String name;
    public double balance;


    public String info(){
        return "Name: " + name + "\n" + "Current Balance: " + balance;
    }

    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }
}
