
public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5,i=1,fact=1;
while(i<=n) {           //1<=5
	fact=fact*i;        //f=1*1->1
	i++;                //i=2
}
System.out.println("the factorial :"+fact);
	}
}
                     //i++
//2<=5  -->f=2*1=2  -->i=3
//3<=5  -->f=1*3=3  -->i=4
//4<=5  -->f=1*4=4  -->i=5
