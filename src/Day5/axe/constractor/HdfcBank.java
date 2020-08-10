package Day5.axe.constractor;

public class HdfcBank extends IcIcBank{
	
		  public HdfcBank() {
			  this(962563145l);
		    System.out.println("Default const...");
		  }
		  public HdfcBank(long phone) {
			  super(10);
			  System.out.println("long phone");
		  }
		  public HdfcBank(int id) {
			  this(456.236f);
			  System.out.println(id);
		  }

		  public HdfcBank(float value) {
			  this();
		 System.out.println("float salary");
		  }  
		  public static void main(String[] args) {
			  HdfcBank a = new HdfcBank();
		  }

		}
	

