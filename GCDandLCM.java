import java.util.*;
class GCDandLCM{

  // GCD and LCM
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int num1 = sc.nextInt() ;
    int num2 =sc.nextInt() ;
    int on1=num1 ,on2 =num2 ;
    while(num1%num2 !=0){
      int rem = num1%num2 ;
      num1=num2 ;
      num2 =rem ;
    }
    System.out.println(num2) ;
    System.out.println((on1*on2)/num2) ;
  }
}
