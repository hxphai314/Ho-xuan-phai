package BaiTapChuongI;
public class Bai3va4 {
		/* Ham sap xep cac phan tu giam dan */
	public static int timMin(int[] a, int n){
		int temp;
		for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (a[i] < a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		       return a[a.length-1]; //phan tu cuoi cua chuoi la Min
		}
		/* Ham main xuat ra Min */
	public static void main(String args[]){
		int a[]={1,2,5,6,3,2};
		System.out.println("Min: "+timMin(a,a.length));
		}}
        