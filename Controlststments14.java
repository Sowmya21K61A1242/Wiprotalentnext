/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */
import java.util.Scanner;
public class Controlststments14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		for(int i=1;i<=input1;i++){
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
