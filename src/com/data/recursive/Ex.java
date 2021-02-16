package com.data.recursive;

public class Ex {

    public static int add(int m, int n){
        if (n == 0) return m;
        return 1+add(m,n-1);
    }

    public static int mul(int m, int n){
        if (n == 0 || m == 0) {
            return 0;
        }
        return m+mul(m, n-1);
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static int pow(int m , int n){
        if (n == 0) return 1;
        return m*pow(m,n-1);
    }

    public static int length(String s){
        if (s.equals("")) return 0;
//        System.out.println(s);
        return 1 + length(s.substring(1));
    }

    public static String reverse(String s){
        if (s.equals(""))return s;
        return reverse(s.substring(1))+s.charAt(0);
    }

    public static int fib(int n){

        if (n==0)return 0;
        if (n<=2)return 1;
        return fib(n-1) + fib(n-2);
    }


    //main method
    public static void main(String[] args) {
        for (int n = 0;n<4;++n){
            System.out.println(fib(n));
        }
    }
}
