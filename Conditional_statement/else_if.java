package Conditional_statement;

import java.util.*;

public class else_if {

    public static void main(String args []){

        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter an age:- ");
            int age = sc.nextInt();

            if(age>=18){
                System.out.println("Adult");

            }

            else if (age>13 && age<18){
                System.out.println("Teenager");

            }

            else {
                System.out.println("Kacha nimdu");
            }

        }
    }
    
}
