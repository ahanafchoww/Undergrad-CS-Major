public class CellPhone {
    public String model = "unknown";
    public int StoredContactsCount = 0;
    public String [] Contacts = new String[3];


    public void storeContact(String a){
        if (StoredContactsCount<=2){
            System.out.println ("Contact Stored");
            Contacts[StoredContactsCount]=a;
            StoredContactsCount++;
        }
        else {
            System.out.println ("Memory full. New contact can't be stored");
        }
    }

    public void printDetails(){

        if (StoredContactsCount==0){
            System.out.println ("Phone Model " + model + "\n" + "Contacts Stored " + StoredContactsCount);
        }
        else {
            System.out.println ("Phone Model " + model + "\n" + "Contacts Stored " + StoredContactsCount + "\n"
                    + "Stored Contacts:" );
            for (int i = 0; i<StoredContactsCount; i++){
                System.out.println (Contacts[i]);
            }
        }

    }
}
