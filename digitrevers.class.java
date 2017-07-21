package guvi;
import java.util.Scanner;
public class revrsedigit{
public static vpoid main (String args[]){
int n;
int m;
int rem;
int r=0;
  Scanner s=new Scanner(System.in);
  n=s.next();
  m=n;
while(n>0){
rem=n%10;
r=r*10+rem;
n/=10;
}
if(m==r){
System.out.println("revrse");
}
else
{
System.out.println("not a reverse");
}
}
}
