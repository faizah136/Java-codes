package com.mycompany.sem3java;
import java.util.Scanner;
public class W3Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("The multiplication table for "+a+" is as follows:");
        for(int i=1;i<=10;i++){
            System.out.println(a+" x " + i + " = " + a*i);
        }
        
    }
    
}
