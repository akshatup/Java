package Conditional_statement;

import java.util.*;

public class print_odd_or_even {

    public static void main (String args[]){
        
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number to check a number is even or odd:- ");
            int number = sc.nextInt();

            if(number % 2 == 0){
                System.out.println("The number is even");
            }

            else{
                System.out.println("The number is odd");
            }
        }

    }
    
}
