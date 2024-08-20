/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
import java.util.Scanner;
public class Controlstatments7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Character:");
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		if (Character.isLowerCase(c)) {
			System.out.println(Character.toUpperCase(c));
		}
		else {
			System.out.println(Character.toLowerCase(c));
		}
	}

}
