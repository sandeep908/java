import java.util.*;
class PrimeFactorization {

  // GCD and LCM
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int num1 = sc.nextInt() ;
    int i=2 ;
    while(num1 !=1){
      if(num1%i==0){
        num1 =num1/i ;
        System.out.print(i+" ") ;
      }
      else{
        i++;
      }
    }
  }
}
