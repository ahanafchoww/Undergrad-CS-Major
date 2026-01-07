public class MobilePhone {
    //setContactCapacity(int capacity) - void method
    //details() - void method
    //addContact(String name, int number) - void method
    //makeCall(int num) - void method

    public int capacity;
    public int contactsCount;
    public String[] contacts;
    public int[] numbers;

    public void setContactCapacity(int cap) {
        this.capacity = cap;
        contacts = new String[capacity];
        numbers = new int[capacity];
    }

    public void details() {
        System.out.println("Total Contacts: " + contactsCount);
        if (contactsCount == 0) {
            System.out.println("Contact List:");
        } else if (contactsCount<=capacity){
            System.out.println("Contacts List:");
            for (int i = 1; i <= contactsCount; i++) {
                System.out.println(contacts[i] + ":" + numbers[i]);
            }
        }

    }
    public void addContact(String contact, int number){
        if (contactsCount<capacity){
            this.contacts[contactsCount+1] = contact;
            this.numbers[contactsCount+1]= number;
            contactsCount++;

        }
        else {
            System.out.println ("Storage Full!!");
        }
    }


    public void makeCall(int number){
        for (int i=0; i<numbers.length;i++){
            if (number==numbers[i]){
                System.out.println ("Calling " + contacts[i] + " . . .");
                break;
            }
            else {
                System.out.println ("Calling " + number + " . . .");
            }
        }
    }
}
