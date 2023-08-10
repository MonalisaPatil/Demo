import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) {
//        Add sum= new Add();
//        int result1 = sum.Addition(23,45);
//        System.out.println(result1);
//
//        Subtraction subtraction= new Subtraction();
//        int result2 = subtraction.sub(43,67);
//        System.out.println(result2);
//
//
//        Multiply multiply= new Multiply();
//        int result3 = multiply.multiplication(65, 78);
//        System.out.println(result3);
//
//        Shadi shadi= new Shadi();
//        System.out.println(shadi.kharcha(500, 1200));
//
//        // Area of Circle :---Static method program
//        Scanner s= new Scanner(System.in);
//        System.out.println(" Enter the radius");
//        long r = s.nextLong();
//        double rt = (double) r;
//        double AOC = (22*rt*rt)/7;
//        System.out.println(AOC);
//
//        //AOC ---using method
//
//
//        //AOC ---inheritance method
//
//
//        //AOC --- using interface
//
//        //AOC ---
//
//
//        // Swap two numbers
//        Swap sw= new Swap();
//        sw.swap(56, 67);
//

        // Finding ASCII code of a number
//        Scanner number= new Scanner(System.in);
//        System.out.println("Enter the number:");
//        String v = number.next();
//        char x = v.charAt(0);
//        int t = (int)x;
//        System.out.println(t);

        // method to find vowel or constant
//            Scanner alpha= new Scanner(System.in);
//            System.out.println("Enter the alpha:");
//            String in= alpha.next();
//            if ("aeiou".contains(in.toLowerCase())){
//            if (in.equalsIgnoreCase("a") ||
//                    in.equalsIgnoreCase("e") ||
//                    in.equalsIgnoreCase("i") ||
//                    in.equalsIgnoreCase("o") ||
//                    in.equalsIgnoreCase("u")){
//                System.out.println(in + " is vowel");
//            }
//            else {
//                System.out.println(in + " is constant");
//            }

        // find the largest among three
//        Three three = new Three();
//        double result= three.largest(4.7, 6.9, 7.3);
//
//        result= result *100;
//
//        System.out.println(result);
//
    // to check alphabet:
//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        char i = st.charAt(0);
//        String output = (i >= 'a' && i <='z') || (i >= 'A' && i <='Z')
//                ? i + " is an alphabet"
//                : i+ " is not an alphabet";
//
//        System.out.println(output);
    //to check if number is positive or negative;
//        Scanner number = new Scanner(System.in);
//        System.out.println(" Enter the number:");
//        double pn = number.nextDouble();
//         if ( pn > 0 ){
//             System.out.println( pn +" The number is positive");
//         } else if (pn < 0) {
//             System.out.println( pn +" The number is negative");
//
//         } else{
//             System.out.println( pn +" The number is zero");
//         }


        // check palindrome

        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.palindromeCheck("naman");
        System.out.println(isPalindrome);
    }


         }






