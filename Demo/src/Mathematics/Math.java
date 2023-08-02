package Mathematics;

public class Math{
    int result1;
    int result2;

    public int Add(int a, int b){
        return a+b;
    }

    public int Sub(int a, int b){
        return a-b;
    }
    public int Mul(int a, int b){
        return a*b;
    }
    public int Div(int a, int b){
        return a/b;
    }
    public void  Solution(int result1, int result2){
        result1=   Add(result1,result2);
        int b=    Sub(result1,result2);
        int c=   Mul(result1,result2);
        int d=  Div(result1,result2);
//        System.out.println("Response: "+a);
        System.out.println("Response: "+ b);
        System.out.println("Response: "+c);
        System.out.println("Response: "+d);

    }


}
