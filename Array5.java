/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 21/06/2024
 */
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,arr[]= {1,2,3,4},s1=Integer.MAX_VALUE,s2=Integer.MAX_VALUE;
		int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>l1) {
				l2=l1;
				l1=arr[i];
			}
			else if(arr[i]>l2 && arr[i]!=l1)
				l2=arr[i];
			if(arr[i]<s1) {
				s2=s1;
				s1=arr[i];
			}
			else if(arr[i]<s2 && arr[i]!=s1)
				s2=arr[i];
		}
		System.out.println("largest 2 numbers "+l1+" "+l2);
		System.out.println("smallest 2 numbers"+s1+" "+s2);
	}

}
