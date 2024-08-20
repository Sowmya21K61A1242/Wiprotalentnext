
/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */
import java.util.Scanner;
public class Controlstatement13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt(),sum=0;
		while(input1>0) {
			sum += (input1%10);
			input1/=10;
		}
		System.out.println("sum of the digits of"+sum);
	}

}
