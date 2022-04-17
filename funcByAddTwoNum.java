import java.util.*;

public class funcByAddTwoNum {
    public static int SumOfNum(int a, int b) {
        return (a + b);
    }

    public static int ProductOfNum(int a, int b) {
        return (a * b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println(SumOfNum(a, b));

        System.out.println(ProductOfNum(a, b));

    }

}
