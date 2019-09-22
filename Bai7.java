package BaiTapMau;
public class Bai7 {
	public static void main(String[] args) {
		int[] A = {5,7,2,4,8};
		for(int i=0;i<A.length;i++)
			for(int j=i+1;i<A.length;j++)
			if (A[i] > A[j])
			{
				int t =A[i];
				A[i]=A[j];
				A[j]=t;
			}
		for (int i=0;i<A.length;i++)
			System.out.println(A[i] +"");
	}
}
