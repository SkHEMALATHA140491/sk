package latha;
public class factorial{
public static void main(String args[]){
int i;
int fact=1;
int n;
Scsanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of"+n+"is"+fact);
}
}
