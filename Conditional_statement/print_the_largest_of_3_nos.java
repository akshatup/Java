package Conditional_statement;

import java.util.*;

public class print_the_largest_of_3_nos {

    public static void main(String args[]){

        try (Scanner sc = new Scanner (System.in)){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a>b && a>c){
                System.out.println(a + " is largest number "+ b +" and " + c );
            }

            else if(b>c){
                System.out.println(b + " is lagest number among " + a + " and " + c);
            }

            else{
                System.out.println( c + " is largest number among " + a + " and " + b);
            }
        }
    }
    
}
