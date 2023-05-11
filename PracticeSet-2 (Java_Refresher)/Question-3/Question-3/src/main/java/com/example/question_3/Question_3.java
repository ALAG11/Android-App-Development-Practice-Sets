package com.example.question_3;

public class Question_3 {
    public static void main(String[] args) {
        int n = 1;
        if(n==1){
            System.out.println("Monday");
        }
        if(n==2){
            System.out.println("Tuesday");
        }
        if(n==3){
            System.out.println("Wednesday");
        }
        if(n==4){
            System.out.println("Thursday");
        }
        if(n==5){
            System.out.println("Friday");
        }
        if(n==6){
            System.out.println("Saturday");
        }
        if(n==7){
            System.out.println("Sunday");
        }
        if(n==0 || n>7){
            System.out.println("Please enter a number that lies between 1 and 7.");
        }


    }
}
