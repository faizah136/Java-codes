package com.mycompany.sem3java;
import java.util.Scanner;
public class W2Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        double a = sc.nextDouble();
        System.out.println("Enter the 2nd number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the 3rd number : ");
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("average = "+avg);
        
    }
}

