import java.util.*;
class PythagoreanTriplet {

  // Pythagorean Triplets
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int a = sc.nextInt() ;
    int b = sc.nextInt() ;
    int c =sc.nextInt() ;
    int h =Math.max(a ,Math.max(b ,c)) ;
    if(a==h){
      System.out.println((a*a)==(b*b+c*c)?"true":"false");
    }
    if(b==h){
      System.out.println((b*b)==(a*a+c*c)?"true":"false");
    }
    if(c==h){
      System.out.println((c*c)==(b*b+a*a)?"true":"false");
    }
    
  }
}
