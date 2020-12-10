
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;
findingPositive(a);
int b=-34;
findingPositive(b);
int c=0;
findingPositive(c);
		
		System.out.println("end");
	}
	
	 static void findingPositive(int b) {
   if(b>0){
		System.out.println(b+" is positive");
	}else if(b<0) {
		System.out.println(b+" is negative");
	}else
	{
		System.out.println(b+"is zero");
	}

	 }
}
	


