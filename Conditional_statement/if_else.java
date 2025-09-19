package Conditional_statement;

import java.util.*;

public class if_else {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter an age: ");
            int age = sc.nextInt();
            
        //     int age = 20;


            if (age >= 18){

                System.out.println("Adult");

            }    

            // if (age > 13 && age < 17){

            //     System.out.println("Teenager");
            // }

            else {

                System.out.println("Not Adult ");
            }

        }

        
    }
    
}
