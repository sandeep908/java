import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    int a=0 , b=1 ;
    int i=0 ;
    System.out.println(a);
    System.out.println(b);
    while(i<n-2){
      int fib = a+b ;
      a=b ;
      b =fib ;
      System.out.println(b);
      i++;
    }
  }
}
