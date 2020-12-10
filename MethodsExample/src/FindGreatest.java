
public class FindGreatest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=55,b=495,c=80;
FindGreatest ref = new FindGreatest();
   int res1=ref.findGreatest(a,b,c);
   System.out.println(res1);
   System.out.println("end");
   }
 
 int findGreatest(int a,int b,int c) {
	int result=0;
	 if(a>b) {
   	  if(a>c) {
   		  result=a;
   	  }
   	      
   	  else {
   		  result=c;
   	  }
     }
     else {
   	  if(b>c) {
   		result=b;
   		  
   	  }
   	  else {
   		result=c;
   	  }
   	  }
	System.out.println("checks");
	return result; //result stmt
}
}
