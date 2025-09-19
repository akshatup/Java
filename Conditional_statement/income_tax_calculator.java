package Conditional_statement;

import java.util.*;

public class income_tax_calculator {
    public static void main(String args []){


        try(Scanner sc = new Scanner(System.in)){

            int income = sc.nextInt();
            int tax;

            if(income<=500000){

                tax = (0*income);
          
            }

            else if(income>500000 && income<=1000000){

                tax = (int) (0.20*income);
              

            }

            else{
                tax = (int) (0.30*income);
        
            }

            System.out.println("Your tax is:- "+ tax);


        }
    }
}