package guvi;

import java.util.Scanner;

public class Removeduplicate {
	public static void main(String args[]){
		String s="hello";
		StringBuilder sb=new StringBuilder("hello");  
		for(int i=0; i<s.length(); i++){
		for(int j=0; j<s.length(); j++){
		char c=	s.charAt(j);
		if(s.charAt(i)==s.charAt(j)){
			if((i+1)==j)
			sb.deleteCharAt(j);
			}
		String s2=s.substring(0,j);
		String s3=s.substring(j);
		String ss=s2.concat(s3);
		}
		}
		System.out.println(sb);
		}
	}

			/*Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String ans="";
			char c;
			int j,i=0;
			j=s.length();
			s+=" ";
			c=s.charAt(0);
			while(i<j)
			{
			ans=ans+c;
			while(s.charAt(++i)==c&&i<j)
			{}
			c=s.charAt(i);
			}System.out.println(ans);*/
	
		
