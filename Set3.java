import java.util.*;

class Set3{

    // Recursive function - gcd --------------
    /*
    public static int gcd(int n1 , int n2){
        int min = Math.min(n1,n2);
        int max = Math.max(n1,n2);
        if(max%min==0){
            return min;
        }
        else{
            return gcd(max%min , min);
        }   

    }
    */
   

    // Recursive function - fact---------------
    /*
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    */

    // Recursive function - sum------------
    /*
    public static int sum(int n){

        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }

    }
    */


    // checkPrime function-----------
    /*
    public static boolean checkPrime(int i){
        boolean bool = true;

        for(int j=2; j<=i/2; j++){
            if(i%j==0){
                bool = false;
                break;
            }
        }

        return bool;
    }
    */


    public static void main(String[] args){


        // Display Factors of a Number
        
        /*
        int n = 24;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        */


       // Simple Calculator

        /*
       Scanner sc = new Scanner(System.in);
       System.out.println("--------------------Simple Calculator------------------");
       System.out.println("");
       System.out.print("Enter first input number : ");
       System.out.print("");
       int n1 = sc.nextInt();
       System.out.println("Choose character :     + : add            - : subtract         * : multiply             / : divide ");
       System.out.print("Input your character : ");
       System.out.print("");
       char ch = sc.next().charAt(0);
       System.out.print("Enter second input number : ");
       System.out.print("");
       int n2 = sc.nextInt();

       switch(ch){
        case '+': System.out.println("Sum : "+(n1+n2));
                  break;
        case '-': System.out.println("Difference : "+(n1-n2));
                  break;
        case '*': System.out.println("Product : "+(n1*n2));
                  break;
        case '/': System.out.println("Divison : "+(n1/n2));
                  break;
        default : System.out.println("Invalid character");
       }

       */



      // Check whether a number can be expressed as sum of two prime numbers or not
    /*
      int n = 34;
      boolean bool = false;

      for(int i=2; i<=n/2; i++){
        if(checkPrime(i)){
            if(checkPrime(n-i)){
                System.out.println(i+" + "+(n-i)+" = "+n);
                bool = true;
            }
        }
      }

      if(!bool){
        System.out.println(n+" cannot be expressed as sum of two prime numbers");
      }

      */


     // Sum of Natural Numbers Using Recursion

    /*
     int n=6;
     int res = sum(n);
     System.out.println(res);
     */


    // Factorial of a number using Recursion
    /*
    int n=7;
    int res = fact(n);
    System.out.println(res);
    */


   // GCD using recursion
   /*
   int n1 = 24;
   int n2 = 9;
   int res = gcd(n1,n2);
   System.out.println(res);
   */



  // Decimal to Binary Conversion
  /*
  int n = 5;
  int var = n;
  int bin = 0;
  int i=1;

  while(n!=0){
    int rem = n%2;
    bin = i*rem + bin;
    n/=2;
    i*=10;
  }

  System.out.println(var+" in binary represented as : "+bin);
  */



 // Binary to Decimal Conversion

/*
 int n = 110;
 int var = n;
 int index = 0;
 int dec = 0;

 while(n!=0){
    int rem=n%10;
    if(rem==1){
        dec = dec + (int)(Math.pow(2,index));
    }
    index++;
    n/=10;
 }

 System.out.println(var+" in decimal representation : "+dec);
 */




    }
}