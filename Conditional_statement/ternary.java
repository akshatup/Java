package Conditional_statement;

import java.util.Scanner;

public class ternary {

    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)){


            System.out.print("Enter a number to check even or odd number:- ");
            int number = sc.nextInt();

           // int number = 4;

            String type = ((number%2) == 0) ? "even number" : "odd number";

            System.out.println(number + " is an " + type);



        }

       
    }
    
}
