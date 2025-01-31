public class Task6 {
    public static void main (String [] args){
        int firstVari = 34;
        int secondVari = 10;
        //First approach
        int thirdVari;
        thirdVari = firstVari;
        firstVari = secondVari;
        secondVari = thirdVari;

        System.out.println (firstVari);
        System.out.println (secondVari);

        /*
        currently,
        firstVari = 10;
        secondVari = 24;
         */


        //Second approach
        firstVari = firstVari + secondVari;
        secondVari = firstVari - secondVari;
        firstVari = firstVari - secondVari;
        System.out.println (firstVari);
        System.out.println (secondVari);


    }
}
