package Day5.axe.constractor;

public class Planets {
	
	  public Planets () {
			this(734.45);
	    System.out.println("Pre Default const...");
	  }

	  public Planets(int id) {
		System.out.println("integerized");
	  }

	  public Planets(String name) {
	     this(68956655);
	    System.out.println(name);
	  }

	  public Planets(long In) {
	    System.out.println(In);
	  }
	  public Planets(double vs) {
		  this(12);
	    System.out.println(vs);

	  }
}


