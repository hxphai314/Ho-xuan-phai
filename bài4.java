package BaiTapMau;
import java.util.Scanner;
public class bài4 {
	public static void manin(String[] args) {
		float a,b,c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("a");
		a = keyboard.nextFloat();
		System.out.println("b");
		b = keyboard.nextFloat();
		System.out.println("c");
		c = keyboard.nextFloat();
		if ((b+a>c) && (a+c>b) && (b+c>a) && (b>0) && (a>0) && (c>0))
		{
			System.out.print("a,b,c la canh cua");
			if ((a==b)&&(b==c)) System.out.println("Tam giac deu");
			else 
				if ((a==b ))
		}
	}
