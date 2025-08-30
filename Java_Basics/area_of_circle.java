import java.util.*;

public class area_of_circle{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the radius:- ");

        int a = sc.nextInt();

        float area = 3.14f*a*a;

        System.out.println("Area of a cicle:- "+ area);

    }
}