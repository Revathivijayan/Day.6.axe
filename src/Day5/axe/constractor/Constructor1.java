package Day5.axe.constractor;

public class Constructor1 extends Constractor2 {
	

		  public Constructor1 () {
				this(3456.5678f);
		    System.out.println("Default const...");
		  }

		  public Constructor1(int id) {
			System.out.println("integerized");
		  }

		  public Constructor1(String name) {
		     super(10);
		    System.out.println(name);
		  }

		  public Constructor1(float sal) {
			  this("java");
		    System.out.println(sal);
		  }

		  public static void main(String[] args) {
			  Constructor1 a = new Constructor1();

		  }



}
