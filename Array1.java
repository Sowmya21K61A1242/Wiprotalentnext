/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4},sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		float avg=(float)sum/arr.length;
		System.out.println(avg);
	}
}
