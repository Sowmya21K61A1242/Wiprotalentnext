/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 21/06/2024
 */
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int arr[]= {1,2,3,4,5},i;
		for(i =0;i<arr.length;i++) { 
			if(arr[i]==key) {
				System.out.println(key+ "is found" +i);
				break;
			}
		}
		if(i==arr.length)
			System.out.println("-1");
	}

}
