public class Employee {
    // An employee will have a name, salary and designation.
    // The name will be assigned inside the newEmployee() method
    // Whenever a New Employee joins his/her salary will be Tk. 30,000 and -
    // - the designation will be junior.
    // Employees with salaries greater than Tk. 50,000 and -
    // - Tk. 30,000 need to pay 30% and 10% of salary as tax respectively.
    // Employees can be promoted to senior, lead and manager positions.
    // Based on their promotion they will get an increment of Tk. 25,000, Tk. 50,000 and Tk. 75,000 respectively.


    //displayInfo() - void Method
    //calculateTax() - void Method
    //promoteEmployee(String) - void Method
    //newEmployee(String) - void method

    public String name;
    public String des = "junior";
    public double salary = 30000.0;
    public double tax = 0.0;

    public void newEmployee(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println ("Employee Name: " + name +"\n" +
                "Employee Salary: " + salary +" Tk\n" +
                "Employee Designation: " + des + "\n");
    }

    public void calculateTax(){
        if (salary<=30000.0){
            tax = 0.0;
            System.out.println("No need to pay tax");
        }
        else if (salary>30000.0 && salary<50000.0){
            tax = salary*(10.0/100.0);
            System.out.println (name + " Tax Amount: " + tax +  " Tk\n");
        }
        else {
            tax = salary*(30.0/100.0);
            System.out.println (name + " Tax Amount: " + tax +  " Tk\n");
        }
    }

    public  void promoteEmployee(String newDes){
        this.des = newDes;
        System.out.println (name + " has been promoted to " + des);
        if (des.equals("senior")){
            salary+=25000.0;
            System.out.println ("New Salary : " + salary);
        }
        else if (des.equals("lead")){
            salary += 50000.0;
            System.out.println ("New Salary : " + salary);
        }
        else if (des.equals("manager")){
            salary += 75000.0;
            System.out.println ("New Salary : " + salary);
        }
    }



}
