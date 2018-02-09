import java.util.Scanner;

public class BirthdayCandle {

	
		static int birthdayCandles (int n, int[] ar){
			n = ar[0];
			int count =0;
			for(int i = 0; i< ar.length; i++){
			if( n< ar[i]){	
				n= ar[i];
				}else if(n==ar[i]){	
					count++;  
					
				}	
			}
			System.out.println(count);
		return count;	
		}
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCandles(n, ar);
	        System.out.println(result);
	    }
	}
