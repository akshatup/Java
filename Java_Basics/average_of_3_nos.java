import java.util.*;

public class average_of_3_nos {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Average of any three nos.");

        System.out.print("enter 1st no.:- ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd no.:- ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd no.:- ");
        int c = sc.nextInt();

        float average = (a+b+c)/3;

        System.err.println("Average of three nos is:- "+ average );


    }
    
}

