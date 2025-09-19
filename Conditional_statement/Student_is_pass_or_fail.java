package Conditional_statement;

import java.util.*;

public class Student_is_pass_or_fail {

    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter Student marks:- ");

            int marks = sc.nextInt();

            // int marks = 23;

            // if(marks>=33){

            //     System.out.println("pass");
            // }

            // else{
            //     System.out.println("fail");
            // }

            String type = (marks>=33) ? "Pass" : "Fail";

            System.out.println(type);


        }



        
    }
    
}
