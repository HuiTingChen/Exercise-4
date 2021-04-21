package ComputerInheritance;
import java.text.DecimalFormat;
public class Main {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		
		Computer objComp = new Computer();
		Asus objAsus = new Asus("Lenovo", "X1 Nano", "Windows 10", "i7", 1234.50, 0.2);
		
		System.out.println("__________________________________________________");
		System.out.println(objComp);
		System.out.println("Price of Computer after discount : RM" + df2.format(objComp.disPrice()));
		
		
		System.out.println("__________________________________________________");
		System.out.println(objAsus);
		System.out.println("Price of Computer after discount : RM" + df2.format(objAsus.disPrice()));
		System.out.println("Price of Computer after tax (18%): RM" + df2.format(objAsus.taxPrice()));
	}
}