public class MobilePhone {
    //setContactCapacity(int capacity) - void method
    //details() - void method
    //addContact(String name, int number) - void method
    //makeCall(int num) - void method

    public int capacity;
    public int contactsCount;
    public String[] contacts;
    public int[] numbers;
    public boolean contactFound = false;

    public void setContactCapacity(int cap) {
        this.capacity = cap;
        contacts = new String[capacity];
        numbers = new int[capacity];
    }

    public void details() {
        System.out.println("Total Contacts: " + contactsCount);
        System.out.println("Contact List:");

        for (int i = 0; i < contactsCount; i++) {
            System.out.println(contacts[i] + ":" + numbers[i]);
        }
    }

    public void addContact(String contact, int number) {
        if (contactsCount < capacity) {
            contacts[contactsCount] = contact;
            numbers[contactsCount] = number;
            contactsCount++;
            System.out.println("The contact of " + contact + " is added.");
        } else {
            System.out.println("Storage Full!!");
        }
    }


    public void makeCall(int number) {
        contactFound = false;

        for (int i = 0; i < contactsCount; i++) {
            if (number == numbers[i]) {
                contactFound = true;
                System.out.println("Calling " + contacts[i] + " . . .");
                break;
            }
        }

        if (!contactFound) {
            System.out.println("Calling " + number + " . . .");
        }
    }
}
