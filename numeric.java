package guvi;
import java.util.Scanner;
public class numeric {
	public static void main (String args[]){
		String n=" ";
		Scanner s=new Scanner(System.in);
		n=s.nextLine();
		for(int i=0; i<n.length(); i++){
		char c = n.charAt(i); 
		if(Character.isDigit(c)||Character.isAlphabetic(c)) {
			System.out.print(true);
		}
				else
		{
			System.out.print(false);
		}
		
	}

}
}
