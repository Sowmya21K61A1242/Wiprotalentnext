/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 22/06/2024
 */
public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 4) {
			System.out.println("Please enter 4 intege numbers");
		}
		else {
			int arr[][] = new int[2][2], index=0;
			System.out.println("Original Array is ");
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					arr[i][j] = Integer.valueOf(args[index++]);
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Reversed Array is ");
			for(int i = 1; i>=0; i--) {
				for(int j=1; j>=0; j--)
					System.out.print(arr[i][j] + " ");
				System.out.println();	
			}
		}
	}
}
