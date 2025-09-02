public class logical_operators {

    public static void main (String args[]){

        // Logical AND (&&)

        //  Statement 1 | Statement 2 | Result 
        //      T       |     T       |   T    
        //      T       |     F       |   F    
        //      F       |     T       |   F    
        //      F       |     F       |   F    

        System.out.println("Logical AND (&&) Operator:- ");
        System.out.println((3>2) && (4>1));
        System.out.println((3>2) && (0>1));


        // Logical OR (||)

        //  Statement 1 | Statement 2 | Result 
        //      T       |     T       |   T    
        //      T       |     F       |   T    
        //      F       |     T       |   T    
        //      F       |     F       |   F    

        System.out.println("\nLogical OR (||) Operator:- ");
        System.out.println((3>1) || (9>2));
        System.out.println((2>1) || (6>7));


        // Logical NOT (!)

        //  Statement | Result 
        //      T     |   F    
        //      F     |   T    

         System.out.println("\nLogical NOT (!) Operator:- ");
        System.out.println( ! (2>9));





    }
    
}
