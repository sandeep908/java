import java.util.*;
class Pattern8 {

  // Pattern-8
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt() ;
    for(int i=1 ;i<=n ;i++){
      for(int j=1 ;j<=n ;j++){
        if((i+j)==n){
          System.out.print("*\t");
        }
        else{
          System.out.print(" \t") ;
        }
        
      }
      
      System.out.println();
    }
  }
}
