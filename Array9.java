/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,10,10,6},n=arr.length,j=0;
		int temp[]= new int[n];
		for(int i : arr) {
			if(i==10) {
				continue;
			}else {
				temp[j++]=i;
			}
		} 
		for(int i : temp)
		{
			System.out.print(i+" ");
		}
		
	}

}
