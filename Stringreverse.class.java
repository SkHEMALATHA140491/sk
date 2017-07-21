package latha;
import java.util.Scanner;
public class palindrome{
public static void main(String args[]){
String s=" ";
Scanner ss=new Scanner(System.in);
s=ss.next();
String r=new StringBuffer(s).revrse().toString();
if((String.valueOf(r)).compareTo(String.valueOf(s))==0){
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
