packagre guvi;
import java.util.Scanner;
public class lcm{
public static void main(String args[]){
int a;
int b;
int c;
ind d;
int lcm;
int gcd;
Scanner s=new Scanner(system.in);
a=s.NextInt();
b=s.nextInt();
while(a!=0){
gcd=a;
a=b%a;
b=gcd;
}
gcd=b;
lcm=(x*y)/gcd;
System.out.println(gcd);
System.out.println(lcm);
}
}
