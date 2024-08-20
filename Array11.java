/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,1,4},flag=0;
		for(int i : arr) {
			if(i!=1 && i!=4) {
				System.out.println("false");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("true");
		}
	}

}
