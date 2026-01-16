public class Reader {


    public int capacity = 2;
    public String name = "New user";
    public int bookCounter;
    public String [] bookList;

    public Reader (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        System.out.println("A new reader is created!");
        bookList = new String [capacity];
    }

    public Reader (String name){
        this.name = name;
        System.out.println("A new reader is created!");
        bookList = new String [capacity];
    }

    public void addBook(String bookName){
        if (bookCounter<capacity){
            bookList[bookCounter] = bookName;
            bookCounter++;
        }
        else {
            System.out.println("No more capacity");
        }
    }

    public void readerInfo(){
        System.out.println("Name: " + name);
        System.out.println ("Capacity: " + capacity);
        System.out.println ("Books:");
        if (bookCounter==0){
            System.out.println("No books added yet");
        }
        else{
            for (int i = 0; i<bookCounter; i++){
                System.out.println("Book " + (i+1) + ": " + bookList[i]);
            }
        }
    }


    public void updateCapacity(int newCapacity)
    {
        this.capacity = newCapacity;
        System.out.println("Capacity has changed to " + newCapacity);
        String [] temp = new String [newCapacity];

        for (int i = 0; i<bookCounter; i++){
            temp [i] = bookList[i];
        }
        bookList = new String [newCapacity];

        for (int i = 0; i<bookCounter; i++){
            bookList [i] = temp[i];
        }

    }
}
