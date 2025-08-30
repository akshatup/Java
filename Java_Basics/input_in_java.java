  
import java.util.*;
public class input_in_java {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);  // sc is leakind because we don't close sc here if you plan to take more input later {watch input_in_java2.java file}
        // String input= sc.next();              // one word only (not print the word which is after the space)        
        // System.out.println(input);

        // String input= sc.nextLine();
        // System.out.println(input);              // print all 

        // int number = sc.nextInt();
        // System.out.println(number);    // for numbers

        float f = sc.nextFloat();
        System.out.println(f);












        
    }
}
