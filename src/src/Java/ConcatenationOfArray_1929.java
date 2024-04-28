package Java;

import java.util.Arrays;

public class ConcatenationOfArray_1929 {
 public static void main(String[] args) {
    int[] numb = {1,3,2,1};
    System.out.println(Arrays.toString(getConcatenation(numb)));

 }
    private static int[] getConcatenation(int[] numb) {
        int n = numb.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i] = numb[i];
            ans[i+n] = numb[i];

        }
        return ans;
    }
 /*
private static int[] getConcatenation(int[] numb) {
    int n = numb.length;
    int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i] = numb[i];
            for (int j = 0; j < n; j++) {
                ans[j+n] = numb[j];
            }
        }
        return ans;
}

  */
}
