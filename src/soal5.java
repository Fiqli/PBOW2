import java.util.Scanner;

public class soal5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String str1,str2;
		str1= obj.nextLine();
		str2= obj.nextLine();
		
		System.out.println(str1.length() + str2.length());
//		
		if(str1.charAt(0) < str2.charAt(0)) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
				
		}
		String KataDepan_Kata1 = str1.substring(0,1);
		String KataBelakang_Kata1 = str1.substring(1);
		String KataDepanDiperbesar = KataDepan_Kata1.toUpperCase();
//		System.out.println(KataDepanDiperbesar + KataBelakang_Kata1);
		String KataDepan_Kata2 = str2.substring(0,1);
		String KataBelakang_Kata2 = str2.substring(1);
		String KataDepanDiperbesar2 = KataDepan_Kata2.toUpperCase();
		System.out.println(KataDepanDiperbesar + KataBelakang_Kata1 + " " + KataDepanDiperbesar2 + KataBelakang_Kata2);		
	}

}