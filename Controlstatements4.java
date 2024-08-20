/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
import java.util.Scanner;
public class Controlstatements4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter characters: ");
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		if ((int)c1<(int)c2){
			System.out.print(c1 + " , " + c2);
		}
		else {
			System.out.print(c2 + " , " + c1);
		}
	}
}
