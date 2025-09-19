public class assignment_operators{

    public static void main(String args[]){

        // Assign  :- =

        int a = 2;
        System.out.println("int a = " + a);
        int b = a;  // b = 2
        System.out.println("Assign (=) operator: b = a  => " + b);


        // Add and assign :- +=

        int c = 5;
        System.out.println("\nint c = " + c);
        c += 10;   // c = c + 10 
        System.out.println("Add and assign (+=) operator: c += 10 => " + c);


        // Subtract and assign :- -=

        int d = 2;
        System.out.println("\nint d = " + d);
        d -= 5;    // d = d - 5
        System.out.println("Subtract and assign (-=) operator d -= 5 => " + d);


        // Multiply and assign :- *=

        int e = 4;
        System.out.println("\nint e = " + e);
        e *= 8; 
        System.out.println("Multiply and assign (*=) operator e *= 8 => " + e);


        // Divide and assign :- /=

        float h = 42;
        System.out.println("\nfloat h = " + h);
        h /= 8; // h = h/8
        System.out.println("Divide and assign (/=) operator h *= 3 => " + h);


        // Modulus and assign :- %=

        int g = 35;
        System.out.println("\nint g = " + g);
        g %= 6; // g = g % 6
        System.out.println("Modulus and assign (%=) operator g %= 6 => " + g);







    }
}