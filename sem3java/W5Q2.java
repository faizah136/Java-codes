package com.mycompany.sem3java;
import java.util.Scanner;
public class W5Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();
        //boolean isPrime = true;
        int fact = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0)
                fact++;
        }
        if(fact==2)
            System.out.println(n+" is a prime number.");
        else
            System.out.println(n+" is not a prime number.");
    }
    
}
