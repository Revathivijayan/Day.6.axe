package Day5.axe.constractor;

public class school {
		  public school () {
			    this(12);
   // this(3456.5678f);
		    System.out.println("Default const...");
		  }

		  public school(int id) {
		  this("JAVA");
		    System.out.println(id);
		  }

		  public school(String name) {
		    System.out.println(name);
		  }

		  public school(float sal) {
		    System.out.println(sal);
		  }

		  public static void main(String[] args) {
			  school a = new school();
		  }

		}

