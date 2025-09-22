package Loops;

import java.util.Scanner;

public class print_a_reverse_of_a_nos {

    public static void main(String args[] ) {

        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number:- ");
            int number = sc.nextInt();
            while(number>0){
                int lastnumber= number%10;
                // System.out.print("Reverse number of " + number + " is= " + lastnumber);
                System.out.print(lastnumber);
                number/=10;
                // System.out.println(number +"a");
            }

            
        }

   
       
        
    }
    
}
