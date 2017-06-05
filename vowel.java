package vowel;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LETTER: ");
char n=s.next().charAt(0);
		if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U'||n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
				System.out.println("VOWELS");
		}
		else{
			System.out.println("CONSONANT");
		}
		s.close();
	}

}
