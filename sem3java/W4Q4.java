package com.mycompany.sem3java;
import java.util.Scanner;
public class W4Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        float sum = 0;
        for(int i=1; i<=n; i++){
            sum += 1.0/i;
        }
        System.out.println("sum= "+sum);
    }
    
}

