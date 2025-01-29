public class Task4 {
    public static void main (String [] args){
        int x = 25251052;
        System.out.println ( "Last digit of the integer is " + x % 10);
        System.out.println ("Second Last digit of the integer is " + (x / 10) % 10);
        System.out.println ("Last two digits of the integer is " + x % 100);
    }
}
