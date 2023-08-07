import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Add sum= new Add();
        int result1 = sum.Addition(23,45);
        System.out.println(result1);

        Subtraction subtraction= new Subtraction();
        int result2 = subtraction.sub(43,67);
        System.out.println(result2);


        Multiply multiply= new Multiply();
        int result3 = multiply.multiplication(65, 78);
        System.out.println(result3);

        Shadi shadi= new Shadi();
        System.out.println(shadi.kharcha(500, 1200));

        // Area of Circle :---Static method program
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter the radius");
        long r = s.nextLong();
        double rt = (double) r;
        double AOC = (22*rt*rt)/7;
        System.out.println(AOC);

        //AOC ---using method


        //AOC ---inheritance method


        //AOC --- using interface

        //AOC ---


   }
}






