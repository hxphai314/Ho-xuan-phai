package BaiTapChuongI;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bai11 {
	public static void main(String[] args) {
		Date time = new Date();
		SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(" Today is:" +a.format(time));
	}

}
