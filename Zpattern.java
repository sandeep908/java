class Zpattern {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    int n =5 ;
    for(int i=0 ;i<n ;i++){
      System.out.print("*") ;
    }
    System.out.println();
    for(int i=1 ;i<n-1 ;i++){
      for(int j =n-1-i ;j>0 ;j--){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    for(int i=0 ;i<n ;i++){
      System.out.print("*") ;
    }
  }
}
