package guvi;
import java.util.Scanner;
public class FibnocciSeries{
public static void main(String args[]{
int n;
System.out.println("enter the number of terms:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int f=2;
int f1=3;
int nextterm;
for(int i=0; i<=n; i++){
nextterm=f+f1;
f=f1;
nextterm=f1;
System.out.println(""+nextterm);
}
}
}
