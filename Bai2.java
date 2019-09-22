package BaiTapChuongI;
public class Bai2 {
	public static void main(String[] arr) {
        int[]  a = {54,24,1,4,93,14};
    	/* tim Min giua 2 so va luu vao temple */
        for (int i=0;i<a.length-1;i++)
        	for (int j=i+1;j<a.length;j++)
        		if (a[i]<a[j])
        		{
        		int t =a[i];
        		a[i]=a[j];
        		a[j]=t;
        		}
        /* in ra day da sap xep */
        for (int i=0;i<a.length;i++)
        System.out.println(a[i] + "");    
        }
        }
        

