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

       
       // Check an alphabet is vowel or consonant
       /*
       char ch = 'e';
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println(ch+" is vowel.");
       }
       else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='u'){
        System.out.println(ch+" is vowel.");
       }
       else{
        System.out.println(ch+" is consonant.");
       }
       */


      // Find the largest among three numbers
      /*
      int n1 = 45;
      int n2 = 96;
      int n3 = 48;

      if(n1>n2 && n1>n3){
        System.out.println(n1+" is largest");
      }
      else if(n2>n1 && n2>n3){
        System.out.println(n2+" is largest");
      }
      else if(n3>n1 && n3>n2){
        System.out.println(n3+" is largest");
      }
      else{
        System.out.println("All are equal");
      }
      */


     // Find all roots of quadratic equation
     /*
     int a=2;
     int b=-1;
     int c=3;          // 2x^2 - x + 3 = 0

     int D = b*b-(4*a*c);

     if(D>=0){
        double root1 = (-b+Math.sqrt(D))/(2*a);
        double root2 = (-b-Math.sqrt(D))/(2*a);

        System.out.println("Root1 : "+root1);
        System.out.println("Root2 : "+root2);
     }
     else{
        double realP = -b/(double)(2*a);
        double imagP = Math.sqrt(-D)/(2*a);

        System.out.printf("Root1 : %.2f + %.2fi ",realP,imagP);
        System.out.println();
        System.out.printf("Root2 : %.2f - %.2fi ",realP,imagP);
     }
     */



    // Check for leap year
    /*
    int year = 1900;
    if(year%4==0){
      if(year%100==0 && year%400==0){
        System.out.println(year+" is leap year");
      }
      else if(year%100==0 && year%400!=0){
        System.out.println(year+" is not leap year");
      }
      else if(year%100!=0){
        System.out.println(year+" is leap year");
      }
    }
    else{
      System.out.println(year+" is not leap year");
    }
    */


   // Check whether a number is +ve or -ve
   /*
   int n = -0;
   if(n>0){
    System.out.println(n+" is positive");
   }
   else if(n<0){
    System.out.println(n+" is negative");
   }
   else{
    System.out.println("zero");
   }
   */


  // Check whether a character is alphabet or not
  /*
  char ch = 'd';
  if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
    System.out.println(ch+" is alphabet");
  }
  else{
    System.out.println(ch+" is not alphabet");
  }
  */




  // Sum of Natural Numbers
  /*
  int n = 10;
  int sum=0;
  for(int i=1; i<=n; i++){
    sum += i;
  }
  System.out.println("Sum : "+sum);      
  */


  // Factorial of Number
  /*
  int n = 12;
  int fact = 1;
  for(int i=n; i>0; i--){
    fact *= i;
  }
  System.out.println("Factorial : "+fact);
  */



  // Generate Multiplication Table
  /*
  int n = 7;
  for(int i=1; i<=10; i++){
    System.out.println(n+" X "+i+" = "+n*i);
  }
  */
    }
}