package com.mycompany.sem3java;
import java.util.Scanner;
public class W4Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fac = 1;
        for(int i = 1;i<=n;i++){
            fac = fac*i;
        }
        System.out.println("Factorial of "+n+" = "+fac);
        
    }
    
}
