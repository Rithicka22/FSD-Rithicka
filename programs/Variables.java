package programs;

public class Variables {
	int a = 25; //instance
	static int b =50; //static
	
	public static int print() {
		int mark = 94;
		return mark;
	}
	
	void display() {
		int d = 60; //local variable
		System.out.println("method inside variable:"+d);
	}
	
	public static void main(String[] args) {
	int c = 75; //local variable
	
	Variables obj1 = new Variables();
	System.out.println(obj1.a);
	obj1.display();
	System.out.println(b);
	System.out.println(c);
	System.out.println(print());
	
	Variable2.show();
	Variable2 v2 = new Variable2();
	v2.students();}

}
