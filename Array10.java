/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,0,0,1,1},n=arr.length;
		int ecount=0,earr[]=new int[n], ocount=0,oarr[]=new int[n];
		for(int i :arr) {
			if(i%2==0) {
				earr[ecount++]=i;
			}
			else {
				oarr[ocount++]=i;
			}
		}
			for(int i=0;i<ecount;i++) {
				arr[i]=earr[i];
			}
			for(int i=ecount;i<ocount;i++) {
				arr[i]=oarr[i-ecount];
			}
		for(int i: arr)
			System.out.println(i+" ");
	}
}
