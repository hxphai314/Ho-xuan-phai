package BaiTapMau;
import java.util.Scanner;
public class Bai6 {
	static void main (String[] args){
		int N;
		int i;
		Scanner keyboard= new Scanner(System.in);
		System.out.print("N =");
		N =keyboard.nextInt();
		for (i=2;i<N;i++)
			if(N%i==0) break;
		if (i<Math.round(Math.sqrt(N)))
			System.out.print("N khong phai la so nguyen to");
		else 
			System.out.print("N phai la so nguyen to");			
	}
}
