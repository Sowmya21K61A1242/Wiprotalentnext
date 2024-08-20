/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 18/06/2024
 */

import java.util.Scanner;

public class ControlStatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int input1 = sc.nextInt(), input2 = sc.nextInt();
		if(input1%10 == input2%10) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
