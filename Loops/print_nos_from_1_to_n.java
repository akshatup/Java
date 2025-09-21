package Loops;

import java.util.Scanner;

public class print_nos_from_1_to_n {

    public static void main(String args[]) {

        try(Scanner sc = new Scanner(System.in)){


            System.out.print("Enter a range:- ");

            int range = sc.nextInt();
            int number = 1;

            while (number<=range) {

                System.out.print(number + " ");
                number++;
                
            }

            System.out.print("\nnumber range is printed from 1 to " + range);
        }
        
    }
    
}
