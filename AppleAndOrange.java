import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

    //static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
    //}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int Larry_Apple_Score =0, Rob_Orange_Score =0;
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            apple[apple_i] = a - apple[apple_i];
            System.out.println(apple[apple_i]);
            if(apple[apple_i] <= t && apple[apple_i] >=s) {
            Larry_Apple_Score++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            orange[orange_i] = b - orange[orange_i];
            System.out.println(orange[orange_i]);

         if(orange[orange_i] <= t && orange[orange_i] >=s) {
        	 Rob_Orange_Score++;
         }
        }
        System.out.printf(Larry_Apple_Score + "\n" + Rob_Orange_Score );
        //countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}

