package latha;
import java.util.Scanner;
public class armstrong{
public static void main(String args[]){
int n;
Scanner s=new Scanner (System.in);
n=s.nextInt();
System.out.println("please enter 3 digit number");
int amstrong=0;
if(is amstrong(n)){
System.out.println(" "+n+"is amstrong number");
}
else
{
System.out.println(" "+n+"is not a amstrong numer");
}
}
private static boolean isamstrong(int n){
int result=0;
int original=n;
while(n!=0){
int rem=n%10;
result=result+rem*rem*rem;
n=n/10;
}
if(original==result){
return true;
}
return false;
}
}
