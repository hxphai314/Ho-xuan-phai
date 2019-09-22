package BaiTapChuongI;
import java.lang.String;
import java.util.Scanner;
public class Bai7 {
	public static<T> int find(T[] a, T target)
	{
		for (int i = 0; i < a.length; i++)
			if (target.equals(a[i]))
				return i;

		return -1;
	}
}
	

