package com.mycompany.sem3java;
public class W5Q5{
    public static void main(String[] args){
      for(int i = 0; i<=100; i++){
          boolean isPrime=true;
          for(int j=2; j<=Math.sqrt(i); j++){
              if(i%j==0){
                  isPrime=false;
                  break;
              }
          }
          if(isPrime==true){
              System.out.println(i);
          }
      }
    }
}
