package org.tip2021;

public class Fibonacci {

    public static int fibonacci(int n , String indent){
        tree(n , indent);
        if(n<0){
            return 0;
        }
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1 , "l") + fibonacci(n-2 , "r");
        }
    }

    private static void tree(int n  , String indent){
        if("l".equals(indent)){
            System.out.print(n + "       ");
        }else{
            System.out.print("        " + n );
        }
        System.out.println();
    }
}
