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

    }


    public void updateCapacity(int newCapacity)
    {
        this.capacity = newCapacity;
        System.out.println("Capacity has changed to " + newCapacity);
    }
}
