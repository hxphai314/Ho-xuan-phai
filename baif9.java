package BaiTapMau;
import java.util.Scanner;
public class baif9 {
	public static int comDiv (int a,int b)
	{
	 return (b==0)?a:comDiv(b, a%b);
	}
	public static void main(String[] args) 
		{	
			int a;
			int b;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("a=");
			a = keyboard.nextInt();
			System.out.print("b=");
			b = keyboard.nextInt();
			System.out.print("USCLN cua "+a+" va "+b+" la "+comDiv(a,b));
		}
	}

