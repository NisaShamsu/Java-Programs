package ControllStatements;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of digits in 5876 is ");
		  int num=5876,count=0;
		  while(num!=0)
		  {
			  num=num/10;
			  count++;
		
		  }
		  System.out.println(count);
	}

}
