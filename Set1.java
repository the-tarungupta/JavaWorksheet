import java.util.Scanner;

class Set1{
    public static void main(String[] args){

        // Print Integer entered by user

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int in = sc.nextInt();
        System.out.print("Your output : "+in);
        */


       // Add two integers
       /*
       int i1 = 45;
       int i2 = 33;
       int res = i1+i2;
       System.out.println("Sum : "+res);
       */


      // Multiply two floating point numbers
        /*
        float f1 = 6.5f;
        float f2 = 5.2f;
        float out = f1*f2;
        System.out.println(out);
        */


       // Find ASCII value of character
       /*
        char ch = 'e';
        System.out.println("ASCII value : "+(int)ch);
        */


       // Compute Quotient and Remainder
       /*
       int n1 = 62;
       int n2 = 5;
       System.out.println("Quotient : "+n1/n2);
       System.out.println("Remainder : "+n1%n2);
       */


      // Swap Two Numbers
            //--- Approach 1 : Using third variable ---- 
            /*
            int n1 = 72;
            int n2 = 36;
            System.out.println("Before swapping - ");
            System.out.print(n1+" | "+n2);
            System.out.println();

            int var = n1;
            n1 = n2;
            n2 = var;
            
            System.out.println("After swapping - ");
            System.out.print(n1+" | "+n2);
            */


           // --- Approach 2 : Without using third variable ---
            /*
            int n1 = 72;
            int n2 = 36;
            System.out.println("Before swapping - ");
            System.out.print(n1+" | "+n2);
            System.out.println();

            n1 += n2;
            n2 = n1-n2;
            n1 = n1-n2;

            System.out.println("After swapping - ");
            System.out.print(n1+" | "+n2);
            */


        // Check number is even or odd 
        /*
        int n = 18;
        if(n%2==0){
            System.out.println(n+" is Even number");
        }   
        else{
            System.out.println(n+" is Odd number");
        }
        */

        


    }
}