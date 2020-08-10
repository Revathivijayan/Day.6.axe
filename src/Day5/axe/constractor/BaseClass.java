package Day5.axe.constractor;

public class BaseClass {

	
		  public BaseClass() {
		    this("JAVA");
		    System.out.println("Default const...");
		  }

		public BaseClass(int id) {
		    this(3456.5678f);
		    System.out.println(id);
		  }

		  public BaseClass(String name) {
		    this(12);
		    System.out.println(name);
		  }

		  public BaseClass(float sal) {
		    System.out.println(sal);
		  }
     BaseClass(long number) {
    	 System.out.println("End");
     }
		  public static void main(String[] args) {
			

		 BaseClass B = new BaseClass();
}
	}

