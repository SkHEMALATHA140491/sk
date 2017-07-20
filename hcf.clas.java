package guvi;
import java.util.Scanner;
public class hcforgcd {
	public static void main(String args[]){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int b;
	b=s.nextInt();
	int hcf=0;
	while(a!=b){
		if(a>b){
			a=a-b;
		}
			else{
			b=b-a;	
		}
	}
		System.out.println(""+a);

	 }
		}
	


