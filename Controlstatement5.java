/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
public class Controlstatement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.valueOf(args[1]);
		if (args[0].equals("female")&& (age>=1 && age<=58)) {
			System.out.println("The percentage of interset is 8.2%");
		}
		else if(args[0].equals("female")&&(age>=59 && age<=100)) {
			System.out.println("The percentage of intrest is 9.2%");
		}
		else if(args[0].equals("male")&&(age>=1 && age<=58)) {
			System.out.println("The percentage of intrest is 8.4%");
		}
		else {
			System.out.println("The percentage of intrest is 10.5%");
		}
	}
}
