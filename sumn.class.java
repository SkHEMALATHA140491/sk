package guvi1;

public class sumandoddsum {
public static void main(String args[]){
	int i;
	int j;
	int sum=0;
	for(i=1; i<=15; i++){
		for(j=1; j<=i; j++){
			sum=sum+j;}
			System.out.println("sum"+sum);
		
		sum=0;
		
	}
	for (int q=15; q<=45;q++){
		if(q%2!=0){
		
		sum=sum+q;
		}
		System.out.println("result"+sum);
	}
}
}
