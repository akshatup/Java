package Conditional_statement;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter a first no:- ");
            int a = sc.nextInt();

  
            System.out.print("Enter a second no:- ");
            int b = sc.nextInt();


            System.out.print("Enter + for Add, - for Subtract, * for Multiply, / for Divide:- ");
            char operator  = sc.next().charAt(0);

            switch (operator) {
                case '+': System.out.println(a+b); 
                    break; 
                
                case '-': System.out.println(a-b);
                    break;

                case '/': System.out.println((float)a/b);
                    break;

                case '*': System.out.print(a*b);
                    break;

                default: System.out.println("Enter a correct opeartor");
                    
            }

           

        }
    }
    
}
