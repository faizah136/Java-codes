package com.mycompany.sem3java;
import java.util.Scanner;
public class W3Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println("sum = " + sum);
    }
}

