/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
import java.util.Scanner;
public class Controlstatments11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt(), nof=0;
		for(int i=2;i<=input1/2;i++) {
			if(input1%i==0) {
				nof=1;
				break;
			}
		}
		if(nof==0)
		{
			System.out.println(input1+" is a prime number");
		}
		else {
			System.out.println(input1+" is not a prime number");
		}
		
	}

}
