package integer;

import java.util.Scanner;

public class digit {
	public static void main(String args[]){
		{ 
			 int n;
			 int count = 0 ; 
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			 while(n > 0) 
			 { 
			  count++ ; 
			  n = n / 10 ; 
			 } 
			 System.out.print(" "+count) ;  
			}

	}
	}
