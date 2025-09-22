package Loops;

import java.util.Scanner;

public class reverse_the_given_nos {

    public static void main(String args[] ) {
        
        try(Scanner sc = new Scanner(System.in)){


            System.out.print("Enter a number:- ");
            int number = sc.nextInt();

            int n = number;

            int res=0;

            while(n>0){


                int lastnumber = n%10;
                res = (res*10) + lastnumber;
                n/=10;

            }

            System.out.print("Reverse number of " + number + " is= " + res);




        }
    }
    
}
