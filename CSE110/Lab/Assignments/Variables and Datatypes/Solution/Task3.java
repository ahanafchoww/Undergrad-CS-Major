public class Task3 {
    public static void main (String [] args){
        double pi = 3.1416;
        int rad = 4;
        double circum = 2*pi*rad;
        double area = pi*rad*rad;
        System.out.println ( " Circumference of the circle is " + circum + " units");
        System.out.println ( " Area of the circle is " + area + " square units");
        //we can also use Math.Pi; but it might not be allowed in thid course
        circum = 2*Math.PI*rad;
        area = Math.PI*rad*rad;
        System.out.println ( " Circumference of the circle is " + circum + " units");
        System.out.println ( " Area of the circle is " + area + " square units");


    }
}
