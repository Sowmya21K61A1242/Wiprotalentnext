package milestone3.metilLinks;
import java.util.Scanner;
public class NambiarNummber {
	public int nambiarNumber(String input1) {
		String res = "";
		int sum = 0;
		boolean process = false;
		boolean isOdd = false;

		for (int i = 0; i < input1.length(); i++) {
		    sum += Integer.valueOf(String.valueOf(input1.charAt(i))); 
		    if (!process) {
		        if (sum % 2 == 0) {  
		            isOdd = false;
		        } else {  
		            isOdd = true;
		        }
		        process = true;
		    } 

		    if((isOdd && sum %2 == 0) || (!isOdd && sum %2 != 0)) {
		    	process = false;
		    	res += String.valueOf(sum);
		    	isOdd = false;
		    	sum = 0;
		    }
		}

		if (process) { 
		    res += String.valueOf(sum);
		}

		return Integer.parseInt(res);

	}
	public static void main(String args[]) {
		NambiarNummber nn = new NambiarNummber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		String input = sc.next();
		sc.close();
		System.out.println("Nambiar number for " + input + " is " + nn.nambiarNumber(input));
	}
}
