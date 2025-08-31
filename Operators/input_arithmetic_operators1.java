import java.util.Scanner;

 // Binary

public class input_arithmetic_operators1 {


    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter 1st no:- ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no:- ");
        int b = sc.nextInt();

        // System.out. println("Enter 3rd no:- ");
        // int c = sc.nextInt();

        System.out.println("Addition of two no.:- "+ (a+b));

        System.out.println("Subtraction of two no.- " + (a-b));

        System.out.println("Multiplication of two nos:- "+ (a*b));

        System.out.println("Division of two nos:- " + (a/b));

        System.out.println("Modulus of two nos:- " + (a%b));


        
        }
            

    }
    
}
