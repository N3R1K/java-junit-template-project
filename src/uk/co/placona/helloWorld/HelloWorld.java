import java.util.Scanner;
public class HelloWorld {

	static double Gehalt;
	
	static double Steuer;
	
	public static void main(String[] args)
	{
		System.out.println("Ich bin ein Steuerrechner");
		
		System.out.println("Geben Sie Ihr monatliches Gehalt in EUR an: ");
		Scanner St = new Scanner(System.in);
		Gehalt = St.nextDouble()*12;
		
		if (Gehalt<=8820)
		{
			Steuer = 0;
		}
		if (Gehalt>8820 && Gehalt <= 13769)
		{
			double y = (Gehalt-8820) / 10000;
			Steuer = (1007.27*y+1400)*y;
		}
		if (Gehalt>=13770 && Gehalt<=54057)
		{
			double z = (Gehalt-13769)/10000;
			Steuer = ((223.76*z)+2397)*z+939.57;
		}
		if (Gehalt>=54058 && Gehalt<=256303)
		{
			Steuer = 0.42*Gehalt-8475.44;
		}
		if (Gehalt>=256304)
		{
			Steuer = 0.45*Gehalt-16164.53;
		}
		
		System.out.println("Ihre monatliche Einkommenssteuer beträgt: " + Steuer/12);
	}
}