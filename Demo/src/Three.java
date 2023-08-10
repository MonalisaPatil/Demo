public class Three {

    public double largest(double a, double b, double c){
        double largestNumber;
        if (a >= b && a >=c){
            System.out.println(a + " is greater than b and c");
            largestNumber=a;
        } else if ( b >= a && b>=c ) {
            System.out.println(b + " is greater tha a and c ");
            largestNumber=b;
        } else {
            System.out.println(c+ " is greater tha a and b");
            largestNumber=c;
        }
        return largestNumber;
    }
}
