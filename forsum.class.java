package latha;
import java.util.Scanner;
public class forsum {

	public static void main (String args[]){
	int n;
	int i;
	int sum=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=0; i<n; i++){
	sum=sum+i;
	}
	System.out.println("result"+sum);
}
}
