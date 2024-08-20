/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */
import java.util.Scanner;
public class Controlstatments17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt(),sum=0,num=input1;
		while(input1!=0) {
			sum=sum*10+input1%10;
			input1=input1/10;
		}
		System.out.println("The palindrome is " +num+ " is " +sum);
	}

}
