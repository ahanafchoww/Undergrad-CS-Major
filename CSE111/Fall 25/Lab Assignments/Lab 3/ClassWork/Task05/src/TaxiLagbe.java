public class TaxiLagbe {
    public String plateNumber;
    public String location;
    public int passengerCount;
    public String [] passengerList = new String [4];


    public TaxiLagbe(String plateNumber, String location){
        this.plateNumber = plateNumber;
        this.location = location;
    }

    public TaxiLagbe(String plateNumber){
        this.plateNumber = plateNumber;
        this.location = "Khulna";
    }

    public void addPassenger(String passengerName, int fare){

    }

    public void addPassenger(String passengerName, int fare, String passengerName2, int fare2){

    }
}
