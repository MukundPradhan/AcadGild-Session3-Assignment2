import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

	public void isPrimeNumber(int input) {
		int dv=0;
		for(int cnt=1;cnt<=input;cnt++) {
			if(input%cnt==0) {
				dv++;
			}
		}	
		
		if(dv==2) {
			System.out.println( input + " is Prime Number ");
			}else {
				System.out.println(input + " is Composite Number ");
			}
		
	}

	public static void main(String args[]) throws IOException {
		
		int inputNum;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a number to check prime or not : ");
		inputNum=Integer.parseInt(br.readLine());
		
		Prime obj=new Prime();
		obj.isPrimeNumber(inputNum);
	}


}
