package milestone3.metilLinks;
import java.util.Scanner;
public class UserIdGeneration {
	public String userIdGeneration(String input1, String input2, int input3, int input4) {
		String sn, ln;
		if(input1.length() < input2.length()) {
			sn = input1;
			ln = input2;
		}
		else if(input2.length() < input1.length()) {
			sn = input2;
			ln =input1;
		}
		else if(input1.compareTo(input2) < 1) {
			sn = input1;
			ln = input2;
		}
		else {
			sn = input2;
			ln = input1;					
		}
		System.out.println(sn + " " + ln);
		String res = sn.charAt(sn.length() - 1) + ln;
		String temp = "";
		for(int i = 0; i < res.length(); i++) {
			char c = res.charAt(i);
			if(Character.isUpperCase(c))
				temp += Character.toLowerCase(c);
			else
				temp += Character.toUpperCase(c);
		}
		
		String pin = String.valueOf(input3);
		res = temp;
		
		return res + (String.valueOf(pin.charAt(input4 - 1)) + String.valueOf(pin.charAt(pin.length() -input4)));
	}
	public static void main(String args[]) {
		UserIdGeneration uig = new UserIdGeneration();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fn = sc.next();
		System.out.print("Enter Last Name: ");
		String ln = sc.next();
		System.out.print("Enter Pin: ");
		int pin = sc.nextInt();
		System.out.print("Enter N value: ");
		int N = sc.nextInt();
		sc.close();
		System.out.println("User Id for " + fn + " " + ln + " is " + uig.userIdGeneration(fn, ln, pin, N));
	}
}
