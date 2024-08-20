/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 18/06/2024
 */
import java.util.Scanner;
public class Controlstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		if(num>0) {
		System.out.print("POSITIVE");
		}
		else if(num<0){
			System.out.print("NEGATIVE:");
		}
		else {
			System.out.print("ZERO");
			sc.close();
		}
	}

}
