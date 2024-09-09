package com.mycompany.sem3java;
import java.util.Scanner;
public class W3Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        while(n>=10){
            n = n/2;
            System.out.println("Number is now :"+n);
        }
        System.out.println("Number is now smaller than 10.");
        
    }
}
