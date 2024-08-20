/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
import java.util.Scanner;
public class Controlstatements8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c) {
		case 'R': System.out.println("Red");
		break;
		case 'B': System.out.println("Blue");
		break;
		case 'G': System.out.println("Green");
		break;
		case 'Y': System.out.println("Yellow");
		break;
		case 'W': System.out.println("White");
		break;
		}
	}

}
