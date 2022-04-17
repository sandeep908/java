import java.util.*;

class leftInvertedTriangle {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; n >= 1; n--) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
