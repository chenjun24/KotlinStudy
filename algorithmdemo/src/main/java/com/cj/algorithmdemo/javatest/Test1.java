package com.cj.algorithmdemo.javatest;

public class Test1 {
    public static void main(String[] args){
        //Fibonacci  1,1,2,,3,5,8,13,21
        System.out.println(fibonacci(7));
        System.out.println(fibonacci1(7));
        System.out.println(fibonacci2(7,0,1));
    }

    public static int fibonacci(int n){
        if (n<=2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int fibonacci1(int n){
      int a = 0,b = 1,f = 1;
      for (int i = 2;i <= n;i++){
          f = a+b;
          a = b;
          b = f;
      }
      return f;
    }
    //1,1,2,,3,5,8,13,21
    //13,8,5,,3,2,1,1,21
    //fibonacci3(7,0,1);
    public static int fibonacci2(int n,int value1,int value2){
        if(n == 1) return value2;
        return fibonacci2(n-1,value2,value2+value1);//7,0,1;6 1,1 ;5,1,2;4,2,3; 3,3,5;2,5,8;1,8,13
    }
}
