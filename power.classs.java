package latha;
import java.util.Scanner;
public class digit {
public static void main(String args[]){
	int power;
	int n;
	int i=1;
	int sum=1;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	power=s.nextInt();
	while(i<power){
		sum=sum*n;
		i++;
	}
	System.out.println(""+n+""+power+""+sum);
	
	
	
}
}
