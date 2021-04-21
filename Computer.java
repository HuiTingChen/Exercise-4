package ComputerInheritance;
//import util package that including Scanner class
import java.util.Scanner;

public class Computer {
	private String Brand;
	private String Model;
	private String OperateSystem;
	private String Processor;
	private double Price;
	private double Discount;
	
	Scanner s = new Scanner(System.in);
	
	Computer() {
		System.out.print("Enter the brand of the computer: ");
		this.Brand = s.nextLine();
		System.out.print("Enter the model of the computer: ");
		this.Model = s.nextLine();
		System.out.print("Enter the operating system of the computer: ");
		this.OperateSystem = s.nextLine();		
		System.out.print("Enter the processor of the computer: ");
		this.Processor = s.nextLine();
		System.out.print("Enter the price of the computer : RM ");
		this.Price = s.nextDouble();
		System.out.print("Enter the discount of the computer (%): ");
		this.Discount = s.nextDouble();
	}
	
	Computer(String b, String m, String os, String p, double pc,double d) {
		this.Brand=b;
		this.Model=m;
		this.OperateSystem=os;
		this.Processor=p;
		this.Price=pc;
		this.Discount=d;
	}
	
	public String getBrand() {
		return this.Brand;
	}
	
	public String getModel() {
		return this.Model;
	}
	
	public String getOperateSystem() {
		return this.OperateSystem;
	}
	
	public String getProcessor() {
		return this.Processor;
	}
	
	public double getPrice() {
		return this.Price;
	}
	
	public double getDiscount() {
		return this.Discount;
	}
	
	public double disPrice() {
		return (this.Price*(1-this.Discount));
	}
	
	
	
	public String toString() {
		return "Brand           : " + Brand + "\n" +
			   "Model           : " + Model + "\n" +
			   "Operating System: " + OperateSystem + "\n" +
			   "Processor       : " + Processor + "\n" +
			   "Price           : RM" + Price + "\n" +
			   "Discount        : " + Discount + "\n" ;
	}
}
