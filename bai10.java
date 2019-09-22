package BaiTapMau;
public class bai10 {
 public static void main(String[] args) {
	String s=" Write a Java program very  easily";
	int count=0;
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)=='a') count++;
		System.out.println("so luong ki tu a co trong chuoi= " +count);
		int index =s.indexOf("Java");
		if (index>=0) System.out.println("tu Java dau tien cua chuoi  " +index);
		else System.out.println("Chuoi khong chua ki tu Java ");
		if (s.startsWith("Write")==true) System.out.println("Tu Write bat dau chuoi");
		else System.out.println("Tu Write khong bat dau chuoi");
		if (s.endsWith("easyly")==true) System.out.println("Tu easly ket thuc chuoi");
		else System.out.println("Tu easly khong ket thuc chuoi");		
 }
}
