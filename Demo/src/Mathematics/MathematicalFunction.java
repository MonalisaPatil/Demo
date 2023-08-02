package Mathematics;

public class MathematicalFunction {

    public boolean isGreaterThanHundred(int int1, int int2) {
        boolean finalResult;
        int sum = int1 + int2;
        System.out.println(sum);
        if (sum > 100) {
            finalResult = true;
        } else {
            finalResult = false;
        }
        return finalResult;
    }

    public String sumIsEven(int int1, int int2) {
        String result;
        int sum = int1 + int2;
        System.out.println(sum);
        if (sum % 2 == 0) {
            result = "sum is even";
        } else {
            result = "sum is odd";
        }
        return result;

    }

    public String combo(int int1, int int2) {
        String result;
        boolean greaterThanHundred = isGreaterThanHundred(int1, int2);
        String even = sumIsEven(int1, int2);
        boolean isEven = even.equals("sum is even");
        if (greaterThanHundred && isEven) {
//            System.out.println("Sum is greater than 100 and its even ");
            result = "Sum is greater than 100 and its even ";
        } else {
//            System.out.println("Sum is either not greater than 100 or its not even ");
            result = "Sum is either not greater than 100 or its not even";

        }
        return result;
    }

}

