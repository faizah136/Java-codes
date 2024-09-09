package com.mycompany.sem3java;
import java.util.Scanner;
public class W4Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int lsd = 0;
        while(n>0){
            lsd = n%10;
            sum += lsd;
            n = n/10;
        }
        System.out.println("sum of the digits = "+sum);
        
    }
    
}
