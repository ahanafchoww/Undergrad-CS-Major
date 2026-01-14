import java.util.Arrays;
public class TaxiLagbe {
    public String plateNumber;
    public String location;
    public int passengerCount;
    public String[] passengerList = new String[4];
    public int fareCollected;


    public TaxiLagbe(String plateNumber, String location) {
        System.out.println("A new taxi has been created");
        this.plateNumber = plateNumber;
        this.location = location;
    }

    public TaxiLagbe(String plateNumber) {
        System.out.println("A new taxi has been created");
        this.plateNumber = plateNumber;
        this.location = "Khulna";
    }

    public void addPassenger(String passengerName, int fare) {
        if (passengerCount < 4) {
            passengerList[passengerCount] = passengerName;
            System.out.println("Dear " + passengerName + "! Welcome to TaxiLagbe");
            passengerCount++;
            fareCollected += fare;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String passengerName, int fare, String passengerName2, int fare2) {
        if (passengerCount <= 2) {
            passengerList[passengerCount] = passengerName;
            System.out.println("Dear " + passengerName + "! Welcome to TaxiLagbe");
            passengerCount++;
            fareCollected += fare;
            passengerList[passengerCount] = passengerName2;
            System.out.println("Dear " + passengerName2 + "! Welcome to TaxiLagbe");
            passengerCount++;
            fareCollected += fare2;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }


    public void printDetails() {
        System.out.print("Taxi number: " + plateNumber + "\n" +
                "This taxi can cover " + location + " area" + "\n" +
                "Total Passenger: " + passengerCount + "\n");

        System.out.println("Passenger List:");

        for (int i = 0; i < passengerCount; i++) {
            System.out.print((passengerList[i]) + " ");
        }

        if (passengerCount!=0){
            System.out.println();
        }
        System.out.println("Total collected fare: " + fareCollected + " Taka");

    }
}
