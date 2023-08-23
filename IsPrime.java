import java.util.Scanner;

class IsPrime {
  public static void main(String[] args) {
    // System.out.println("Hello world!");

    Scanner sc = new Scanner(System.in) ;
    int t = sc.nextInt() ;
    for(int i=0 ;i<t ;i++){
      int num =sc.nextInt() ;
      for(int j=2 ;j<=Math.sqrt(num) ;j++){
        if(num%j==0){
          System.out.println("Not prime");
          return ;
        }
      }
      System.out.println("Prime");
    }
  }
}
