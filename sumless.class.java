package guvi;
import java.util.Scanner;
public class sum{
public static void main (String args[]){
int i;
int n;
int sum=0;
int r=0;
Scanner s=new Scanner (System.in);
n=s.nextInt();
while(n!=0){
i=n%10;
r=r*10+i;
n=n/10;
sum=sum+i;
system.out.println(" "+sum);
}
}
}
