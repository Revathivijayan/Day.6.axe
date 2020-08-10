package Day5.axe.constractor;

public class Const {
	public  Const() {
		System.out.println("constructor");
	}
	public  Const(String b) {
		System.out.println("soundar");
	}
	public  Const(int a) {
		System.out.println(a);
	}
  public static void main(String[] args) {
	Const c=new Const("soundar1");
	Const E=new Const();
	   Const F=new Const(10);

  }
 }

