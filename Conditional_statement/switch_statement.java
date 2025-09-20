package Conditional_statement;

import java.util.Scanner;

public class switch_statement {    //switch is a reserved keyword in Java, we cannot use it as a class name, variable name, or method name.
    
    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number from 1 to 4 for fast food:- ");
            int number =sc.nextInt();
            //int numbers = 2;

            switch(number){

                case 1: System.out.println("Pizza");
                            break;            
                case 2: System.out.println("Burger");
                            break;
                case 3: System.out.println("Samosa");
                            break;
                case 4: System.out.println("Maggi");
                            break;
                default: System.out.println("ERROR!! Enter a from 1 to 4 not "+ number + " ok, so try again");
            }
        }


        
    }
}
