package BaiTapChuongI;
import java.util.Scanner;
public class Bai5 {
		   public static void main(String args[]) {
			   int num1,num2, num3 ;		 
			   /* Tim max cua 3 so */
			   Scanner scanner = new Scanner(System.in);
			   System.out.println(" Nhap 3 so: ");
			   		num1 = scanner.nextInt();  
			   		num2 = scanner.nextInt();  
			   		num3 = scanner.nextInt();  
			   if (num1 >= num2 && num1 >= num3)
		         System.out.println( num1 );
		      else if (num2 >= num1 && num2 >= num3)
		         System.out.println( num2 );
		      else
		         System.out.println( num3);
		   }
		}