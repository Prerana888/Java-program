
public class Factorial {
public static void main(String args[]) {
	 
	int a=5;
	FactorialOfNum(a);
	int b=8;
	FactorialOfNum(b);
	int d=54;
	FactorialOfNum(d);
	System.out.println("end");
}
  static void FactorialOfNum(int a) {
	System.out.println("call");
	  int n = 55,i=1,fact = 1;
	
	while(i<=n) {
		fact=fact*i;
		i++;
	 } 
	System.out.println(fact);
	System.out.println(a);
  }
}
