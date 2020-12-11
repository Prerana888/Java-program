
public class NoConstructorUsed {
	int num;
	String name;
	int age;

	NoConstructorUsed() { // no constructor is used to assign value
	}

	public static void main(String[] args) {
		NoConstructorUsed value = new NoConstructorUsed();
		System.out.println(value.num); // default value--->0
		System.out.println(value.name); // default value-->null
		System.out.println(value.age);

	}

}
