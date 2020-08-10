package Day5.axe.constractor;

public class A extends B{ 
	
	  public A() {
		
this(10);
	    System.out.println("Default const...");
	  }

	public A(float value) {
		this("apple");
	System.out.println("constractor value");
	}
   public A(String name) {
	   super(10);
	System.out.println("string value");

}

	public static void main(String[] args) {
	    A a = new A();
	  }

	}
