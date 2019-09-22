package BaiTapChuongI;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap: ");
		String str = scanner.nextLine();
		String res = "";
		for (int i=str.length()-1 ;i>=0;i--)
	       res += str.charAt(i);
		System.out.println("");
		System.out.println(res);		
}
}