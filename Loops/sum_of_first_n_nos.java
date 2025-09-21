package Loops;

import java.util.Scanner;

public class sum_of_first_n_nos {

    public static void main(String args[]){

        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number:- ");
            int n = sc.nextInt();
            
            //int n=5;

            int sum = 0;
            int i = 0;
            while(i<=n){         
                sum+=i;
                i++;
            }

        System.out.println("Sum of first " + n + " numbers= " + sum);
        }
        
    }
    
}
