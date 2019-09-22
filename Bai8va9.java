package BaiTapChuongI;
import java.util.Scanner;
public class Bai8va9 {
	    public static void main(String[] args) {
	    	String str = "";
	    	Scanner inp = new Scanner(System.in);
	    	System.out.println("Nhap: "); 
	    	str = inp.nextLine();
	    	System.out.println("chuoi vua nhap: " + str); 
	    	System.out.println(Check(str));          
	    	/* Ham kiem tra chuoi so nguyen tra ve gia tri true false */
	    }
	    	public static boolean Check (final String str) { 
	        if (str == null || str.length() == 0) {
	            return false;
	        }
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
		