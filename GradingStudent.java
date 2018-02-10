import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudent {

    static int[] solve(int[] grades){
    		int rem =0;
    		
    		for(int i = 0; i < grades.length; i++) {
	    		rem = grades[i]%5;
	    		if((rem == 3 || rem ==8) && grades[i]>38) {
	    			grades[i]+=2;
	    		}else if ((rem==4 || rem ==9) && grades[i]>38) {
	    			grades[i]+=1;
	    		}
    		}
    		return grades;

    		}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

