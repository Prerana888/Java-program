
public class ToFindEven {
	public static void main(String ags[])
	{
		int num1=10;
		findingEven(num1);
		int num2=25;
		findingEven(num2);
		System.out.println("end of program");
	}

	  static void findingEven(int num) {
		// TODO Auto-generated method stub
		System.out.println("method calling");
		  if(num%2==0)
		  {
			  System.out.println(num+"is even");
			 
		  }else
		  {
			  System.out.println(num+"is odd");
		  }
	}

	
	
	
	}
	


