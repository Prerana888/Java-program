
public class ToFindAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("To find Alphabet or not");

char x='1',y='p';

ToFindAlphabet ref=new ToFindAlphabet();
char res= ref.toFindAlphabet(x,y);
System.out.println(res);
	}

	char toFindAlphabet(char x,char y) {
		 char result=0;
	
		 if((x>='a'&&y<='y')||(x>='A'&&y<='z')) { 
		 result=x ;  //+is Alphabet;
		 }
		 else {
			System.out.println(y +" is Alphabet");
			 //result=y;   //+"not Alphabet";
	}

	return result;
}
}
