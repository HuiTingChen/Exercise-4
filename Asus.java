package ComputerInheritance;

public class Asus extends Computer{ //Asus (child/Subclass) extends means as inheret data and method from Computer (Parent/Super class)
	

	Asus(String b, String m, String os, String p, double pc,double d) {
		super(b, m, os, p, pc, d); //super=parent(Rectangle)
	}
	
	public double disPrice() {
		return getPrice() * (1-getDiscount());
	}
	
	public double taxPrice() {
		return super.disPrice() * 1.18;
	}
	
	public String toString() {
		return super.toString();
	}							
}
