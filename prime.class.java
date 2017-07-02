package latha;
import java.util.Scanner;
public class prime{
public static void main (String args[]){
int i;
for(i=10; i<=99; i++){
if(i%2!=0 &&i%3!=0 && i%5!=0 && i%7!=0){
System.out.println("prime numbers"+i);
}
}
}
}
