public class Cat {
    public String color = "White"; //Default Value Setup instead of leaving it null
    public String action = "sitting"; //Default Value Setup instead of leaving it null

    public void printCat() //Void because it returns nothing while there's no receiving end as well
    {
        System.out.println (color + " cat is " + action);
    }
}
