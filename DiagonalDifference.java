import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

   
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        	int ansA =0 ;
        	int ansB =0;
        	for(int i = 0; i < a.length; i++){          
                ansA += a[i][i]; 
                ansB += a[i][n-1-i];
                
        	}
        	
            int ans = Math.abs(ansA - ansB);
        System.out.println(ans);
        in.close();
    }
}
