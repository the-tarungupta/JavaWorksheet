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

    }
}