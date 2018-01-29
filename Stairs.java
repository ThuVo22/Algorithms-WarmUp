import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StairCase {

    public static void main(String[] args) {

   
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String str="#";
    for (int i=0;i<n;i++)
        { 
       

        System.out.printf("%"+n+"s%n",str);
        str+="#";
    }
   // System.out.printf("%n", str);
}
}

