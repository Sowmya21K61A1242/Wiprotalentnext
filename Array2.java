/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 20/06/2024
 */

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,8,5,6}, min=Integer.MAX_VALUE , max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min)
				min=arr[i];
			if (arr[i]>max)
				max=arr[i];
			}
		System.out.println("max element is"+max);
		System.out.println("min element is"+min);
	}

}
