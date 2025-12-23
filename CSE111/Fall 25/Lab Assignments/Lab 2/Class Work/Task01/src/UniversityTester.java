public class UniversityTester
{
    public static void main (String[]args){

        /* Task1(a) */

        University U1 = new University(); //First Object
        University U2 = new University(); //Second Object
        System.out.println (U1);
        System.out.println (U2);
        //No, the location of the objects are not the same here (U1 and U2)



        /* Task1(b) */

        U1.name = "Imperial College London";
        U1.country = "England";
        U2.name = "BRAC University";
        U2.country = "Bangladesh";

        System.out.println (U1.name);
        System.out.println (U2.name);
        // Yes, it has changed - not the same value anymore
        System.out.println (U1.country);
        System.out.println (U2.country);
        // Yes, it has changed - not the same value anymore
        

    }
}
