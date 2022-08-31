import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soal1 {
	
	public static void checked(String[] number){
		//periksa setiap number dalam string
		for(String num:number) {
			try {
				long x = Long.parseLong(num);
				System.out.println(x + " can be fitted in:");
				if((Byte.MIN_VALUE <= x) & (x <= Byte.MAX_VALUE) ) {
					System.out.println("* byte");
				}
				if((Short.MIN_VALUE <= x) & (x <= Short.MAX_VALUE)){
					System.out.println("* short");
				}
				if((Integer.MIN_VALUE <= x) & (x <= Integer.MAX_VALUE)){
					System.out.println("* Integer");
				}
				if((Long.MIN_VALUE <= x) & (x <= Long.MAX_VALUE)){
					System.out.println("* Long");
				}
			} catch (NumberFormatException e) {
				System.out.println(num + " can't be fitted anywhere");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner myObj =new Scanner(System.in); //membuat scanner object
		String[] number = new String[myObj.nextInt()];
		//read input
		myObj.nextLine();
		for (int i = 0; i < number.length; i++)
		{
			number[i] = myObj.nextLine();
		}
		myObj.close();
		//memanggil procedure untuk check
		checked(number);
	}
}
