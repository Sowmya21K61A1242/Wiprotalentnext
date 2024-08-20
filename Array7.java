/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 21/06/2024
 */
import java.util.HashSet;
import java.util.Set;
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,12,45,67,89};
		Set<Integer> set=new HashSet<>();
		for (int i :arr) {
			set.add(i);
		}
		int[] uniqueArr = new int[set.size()];
		int index = 0;
		for(int i : set) {
			uniqueArr[index]=i;
			index++;
		}
		for(int i:uniqueArr)
		System.out.print(i +" ");
		}

}
