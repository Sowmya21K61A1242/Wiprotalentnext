/* 
 * PBL ID : J_1690223
 * Author : Sowmya Pandiri
 * Date : 19/06/2024
 */
public class Controlstatements6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='@';
		if(Character.isLetter(c)) {
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(c)) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
