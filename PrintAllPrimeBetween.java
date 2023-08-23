import java.util.Scanner;

class PrintAllPrimeBetween {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in) ;
    int low= sc.nextInt() ;
    int high = sc.nextInt() ;
    for(int i=low ;i<=high ;i++){
      int num =i ;
      int count=0 ;
      for(int j=2 ;j<=Math.sqrt(num) ;j++){
        if(num%j==0){
          count++ ;
          break ;
        }
        // else{
        //    System.out.print(i +" ") ;
        // }
      }
      if(count<=0){
        System.out.print(num +" ") ;
      }
       
    }
    System.out.println();
  }
}
