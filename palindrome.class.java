package LATHA;
import java.util.Scanner;
public class palindrome {
public static void main(String args[]){
	int r;
	int rem=0;
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
for(int i=0; i<1; i++){
  r=n%10;
  rem=rem*10+r;
  n=n/10;
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
