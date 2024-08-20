/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */
import java.util.Scanner;
public class Controlstatments12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  nof=0;
		int a=sc.nextInt(), b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			nof=0;
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				nof=1;
				break;
			}
			
			}
			if (nof==0){
				System.out.println(i + " ");
			}
		}
	}

}
