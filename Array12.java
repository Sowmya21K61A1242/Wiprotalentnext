/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		int brr[]= {4,5,6};
		int crr[]=new int[2];
		crr[0] = arr[1];
		crr[1] = brr[1];
		for(int i:crr) {
			System.out.print(i+" ");
		}
	}

}
