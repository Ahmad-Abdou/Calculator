package org.example;

import java.util.Scanner;

public class MyCalculator
{
    private static double result;

    public static void main(String[] args )
    {
        int count = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        while(true){

            System.out.println("Enter your first number");
            int input1 = sc.nextInt();

            System.out.println("choose your opperation (+  -  /  *) ");
            char str = sc.next().charAt(0);

            System.out.println("Enter your second number");
            int input2 = sc.nextInt();
            if (str == '+'){
                Addition(input1, input2);
            }
            else if (str == '-'){
                Subtraction(input1, input2);
            }
            else if (str == '*'){
                Multiplication(input1, input2);
            }
            else if (str == '/'){
                if(input2 == 0){
                    System.err.println("your denominator cant be Zero, try again!");
                    System.exit(-1);
                }
                Division(input1, input2);
            }
            System.out.println("The result: "+result);
            System.out.println("process number "+count);
            count++;

        }

    }

    public static double Addition(int num1 ,int num2 ){
        result = num1 + num2;
        return result ;
    }

    public static double Subtraction(int num1 ,int num2 ){
        result = num1 - num2;
        return result ;
    }
    public static double Division(int num1 ,int num2 ){
        result = num1 / num2;
        return result ;
    }
    public static double Multiplication (int num1 ,int num2 ){
        result = num1 * num2;
        return result ;
    }
}