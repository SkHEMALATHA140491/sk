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

			
