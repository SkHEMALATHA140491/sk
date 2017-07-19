package logics;

public class countallsubstrings {
public static String output1;
public static String output2;
public static void main(String args[]){
	countallsubstrings("mania",'m');
}
public static void countallsubstrings(String input1,char input2){
	String s1="mania";
	char c='m';
	int count=0;int s=0;
	for(int j=1;j<s1.length();j++){
		
for(int i=0;i<s1.length()-j;i++){
	System.out.println(s1.substring(i,i+j+1));
	count++;
  }}
  System.out.println(count);
  }
  }
