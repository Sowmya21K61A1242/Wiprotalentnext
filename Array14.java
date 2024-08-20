/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
			int arr[][] = new int[3][3], index=0, max=Integer.MIN_VALUE;
			System.out.println("Original Array is ");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					arr[i][j] = Integer.valueOf(args[index++]);
					System.out.print(arr[i][j] + " ");
					if(arr[i][j] > max)
						max= arr[i][j];
				}
				System.out.println();
			}
			System.out.println("Maximum element is " + max);
		}
	}
}
