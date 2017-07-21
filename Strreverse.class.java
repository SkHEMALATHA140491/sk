package logics;

public class palindrome {
public static void main(String args[]){
largestpossiblepalin("kavin");
}
public static void largestpossiblepalin(String in1){
	int l=in1.length();
String s=String.valueOf(l);
    String reverse=new StringBuffer(in1).reverse().toString();
    System.out.println(in1);
 System.out.println(reverse);
System.out.println(s);
if(String.valueOf(reverse).compareTo(String.valueOf(in1))==0) {
    	System.out.println(" palindrome");
    }
  
    else{
    	System.out.println("not a palindrome");
    }
}
}
