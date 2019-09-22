package BaiTapMau;
import java.util.Scanner;
public class Bài3 {
	public static void main(String[] args ) {
		float a,b,c,x1,x2,del;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("a=");
		a = keyboard.nextFloat();
		System.out.printf("b=");
		b = keyboard.nextFloat();
		System.out.printf("c=");
		c = keyboard.nextFloat();
		if(a==0)
				if(b==0)
					if(c==0) 
						System.out.println("phuong trinh vo so nghiem");
					else 
						System.out.println("phuogn trinh vo nghiem");
				else 
						System.out.println("phuong trinh cos nghiem = "+ (-c/a));
		else 
		{
			del = b*b - 4*a*c;
			if (del < 0)
				System.out.println("phuong trinh vo nghiem");
			else
				if (del==0) {
				x1=x2=-b/(2*a);
				System.out.println("phuong trinh co nghiem kep =" +x1);
				}
				else {
					x1=(float)(-b+Math.sqrt(del))/(2*a);
					x2=(float)(-b-Math.sqrt(del))/(2*a);
					System.out.println("phuong trinh 2 nghiem: \n x1 = "+x1+" \n x2=" +x2);
		}				
	}
}
}
