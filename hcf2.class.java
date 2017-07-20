package guvi;
public class hcf2{
public static void main(String args[]){
int a=48;
int b=24;
while(a!=b){
if(a>b){
a=a-b;
else
{
b=b-a;
}
}
System.out.println(a);
}
}
