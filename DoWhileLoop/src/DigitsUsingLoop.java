
public class DigitsUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("finding number of digits");
       int n=456, count=0;
do {
	n=n/10;
	count++;
	}while(n!=0);

     System.out.println("the given no.of  digits is:"+count);
	}
}
