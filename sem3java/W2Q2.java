package com.mycompany.sem3java;
import java.util.Scanner;
public class W2Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        float a = sc.nextFloat();
        System.out.println("Enter the 2nd number : ");
        float b= sc.nextFloat();
        float product = a*b;
        System.out.println("product = "+ product);
    } 
}
