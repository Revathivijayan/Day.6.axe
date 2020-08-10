package Day5.axe.constractor;

public class Tree extends Planets {
	
		  public Tree () {
				this(489652222);
		    System.out.println("Default const...");
		  }

		  public Tree(int id) {
			  this("sound");
			System.out.println("integerized id");
		  }

		  public Tree(String name) {
		    System.out.println(name);
		  }
		  public Tree(float f) {
         super(10);		 
         System.out.println(f);
		  }
         public Tree(short sal) {		 
             System.out.println("byte=+b");
         }
              
     public static void main(String[] args) {
    	 Tree seed = new Tree();

     }

}
