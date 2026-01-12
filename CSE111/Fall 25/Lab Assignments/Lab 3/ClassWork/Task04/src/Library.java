public class Library {
    public int capacity;
    public int bookCount;
    public String [] bookList;



    public Library(int capacity){
        this.capacity = capacity;
        bookList = new String [capacity];
        System.out.println("A library has been created with capacity " + this.capacity);
    }

    public void addBook(String bookName){
        if (bookCount<capacity){
                bookList[bookCount] = bookName;
                System.out.println ("Book '" + bookName + "' added to the Library");
            bookCount++;
        }
        else {
            System.out.println ("Exceeds maximum capacity. You can't add more than " +
                    capacity + " books");
        }
    }


    public void printDetail(){
        System.out.println("Maximum Capacity: " + capacity);
        System.out.println("Total Books: " + bookCount);
        System.out.println("Book List:");
        for (int i = 0; i<bookCount; i++){
            System.out.println(bookList[i]);
        }
    }

}
