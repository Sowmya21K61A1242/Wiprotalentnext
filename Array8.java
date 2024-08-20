/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 21/06/2024
 */
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,6,12,7,9},sum=0;
		boolean ignore=false;
		for(int i : arr) {
			if(i==6)
				ignore=true;
			if(!ignore)
				sum=sum+i;
			if(i==7)
				ignore=false;
		}
		System.out.println("sum of the elements"+sum);
	}

}
