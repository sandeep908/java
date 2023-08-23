import java.util.Scanner;

class PrintDigit {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    // int count=0 ;
    while(n>0){
      int digit = n%10 ;
      System.out.println(digit);
      n = n/10 ;
    }
    System.out.println();
  }
}
