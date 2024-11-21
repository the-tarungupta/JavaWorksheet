public class Set2{
    public static void main(String[] args){

        // Display Fibonacci Series 
        // 0 , 1 , 1 , 2 , 3 , 5 , ....
        /*
        int term1 = 0;
        int term2 = 1;
        int n=10;
        int nextTerm = 1;
        for(int i=1; i<=n; i++){
            System.out.print(term1+" ");
            nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
        */


       // GCD of two numbers  ( HCF )
       /*
       int n1= 10;
       int n2= 15;
       int gcd=1;
       int maxN = Math.max(n1,n2);
       for(int i=1; i<=maxN; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
       }
       System.out.println("GCD : "+gcd);
       */


      // LCM of two numbers
      /*
      int n1 = 12;
      int n2 = 21;
      int lcm = 1;
      int minN = Math.min(n1,n2);
      for(int i=minN; ; i++){
        if(i%n1==0 && i%n2==0){
            lcm = i;
            break;
        }
      }
      System.out.println("LCM : "+lcm);
      */


     // Display alphabets(A-Z)
    /*
     for(char ch='A'; ch<='Z'; ch++){
        System.out.print(ch+"  ");
     }
    */


   // Count no. of digits in integer
   /*
   int n = 72304;
   int digit = 0;
   while(n!=0){
    n/=10;
    digit++;
   }
   System.out.println("No. of digits : "+digit);
   */


  // Reverse a Number
  /*
  int n = 23401;
  int rev = 0;
  while(n!=0){
    int rem = n%10;
    rev = rev*10+rem;
    n/=10;
  }
  System.out.println("Reverse number : "+rev);
  */



 // Power of Number
 /*
 int base = 4;
 int exp = 3;
 int pow=1;
 for(int i=1; i<=exp; i++){
    pow*=base;
 }
 System.out.println("Power : "+pow);
 */



// Check Palindrome
// For number 
/*
int n = 727;
int var = n;
int rev = 0;
while(n!=0){
    int rem = n%10;
    rev = rev*10+rem;
    n/=10;
}
if(rev==var){
    System.out.println("Yes Palindrome");
}
else{
    System.out.println("Not Palindrome");
}
*/

// For String
/*
String str = "abacdcaba";
String rev = "";
for(int i=str.length()-1; i>=0; i--){
    rev += str.charAt(i);
}
if(str.equals(rev)){
    System.out.println("Yes Palindrome");
}
else{
    System.out.println("No Palindrome");
}
*/



    }
}