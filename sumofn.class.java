package guvi1;
import java.util.Scanner;
public class latha1 {
	public static void main (String args[]){
int n;
int r=0;
int sum=0;
int a=0;
int o=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int i;
while(n!=0){
i=n%10;
r=r*10+i;
n=n/10;
sum=sum+i;
System.out.println(" "+sum);
}
	for (i=15; 1<=45; i++){
		if(n%2==0){
			System.out.println(" it is odd"+a);
			o=o+a;
		}
		System.out.println(" "+sum+""+o);
	}
}
}
