import java.util.*;
class Pattern11 {

  // Pattern-11
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    int num=1 ;
    for(int i=0 ;i<n ;i++){
      for(int j=0 ;j<=i ;j++){
         System.out.print(num+"\t");
        num++ ;
      }
      System.out.println();
    }
  }
}
