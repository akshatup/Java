package Conditional_statement;

import java.util.*;

public class print_the_largest_2_nos {

    public static void main (String args[]){

        try (Scanner sc = new Scanner(System.in)){


            System.out.print("Enter a value of \"a\" equal to:- ");
            int a = sc.nextInt();

            System.out.print("Enter a value of \"b\" equal to:- ");
            int b = sc.nextInt();

            // int a = 20;
            // int b = 10;

            if(a<b){
                System.out.println(b + " is largest than " + a + "  ,b>a");
            }
            else{
                System.out.println(a + " is largest than " + b + " ,a>b");
            }


        }



        
    }
    
}
