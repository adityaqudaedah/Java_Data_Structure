package com.data.main;

import java.util.Scanner;

class loop{
    public static void forLoop(){
        int i, j, k, l, m, bound;
        System.out.print("Enter Bound [1/0] : ");
        Scanner scanner = new Scanner(System.in);
        bound = scanner.nextInt();
        //initialize variable of i that you want
        //in my case i=7
        for (i = 7; i > bound; i-=2) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%d",i-j+1);
            }
            for (k = 7; k >i; k-=2) {

                System.out.print("  ");
            }
            System.out.print("|");

            for (l = 7; l > k; l-=2) {

                System.out.print("  ");
            }
            for (m = 1;m <=i;m++ ){
                System.out.printf("%d",m);
            }System.out.println();
        }

    }
}
