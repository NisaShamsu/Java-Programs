package Exam;
public class OddEvenArray {

	public static void main(String[] args) {
		
		int a[]= {122,85,63,42,1,9,7,5};
		System.out.println("Elements in the array");
		for(int i=0;i<a.length;i++)
		{	
				System.out.println(a[i]);
		}
		
		System.out.println("odd numbers in the array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Even numbers in the array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
			
	}

}
