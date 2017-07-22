package guvi;
import java.util.Scanner;
public class removevowels{
Public static String output1;
public static String output2;
public static void main(String args[]){
String s="";
String str="";
Scanner s1=new Scanner (System.in);
s=s1.next();
String reverse=new StringBuffer(s).reverse().toString();
output1=reverse;
SysteM.out.println(output1);
System.out.println("removing the vovwels from String["+s+"]\n");
str=s.replaceAll("[aeiouAEIOU]","");
String rev=new StringBuffer(str).reverse().toString();
output2=rev;
System.out.println(output2);
}
}
