package LATHA;
import java.util.Scanner;
public class palindrome {
public static void main(String args[]){
	int r=0;
	int rem;
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n!=0){
  rem=n%10;
  r=r*10+rem;
  n=n/10;
	}
  if(r==n){
	 System.out.println("it is palindrome"); 
  }
  else
  {
		 System.out.println("it is not a palindrome"); 
  }
}
}
}
