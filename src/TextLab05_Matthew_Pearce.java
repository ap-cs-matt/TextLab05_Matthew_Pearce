import java.util.*;

public class TextLab05_Matthew_Pearce {

	static double num, den; // numerator and denominator of the rational number

	public static void main(String args[]) {
		String response;
		do {
		enterData();

		Rational r = new Rational(num, den);

		r.displayData();
		Animation.animate("\n\nWould you like to repeat this program [Y/N] >>>>");
		Scanner scan = new Scanner(System.in);
		response = scan.nextLine(); 
		}
		while(response.equalsIgnoreCase("y"));
	}

	public static void enterData() {
		Scanner input = new Scanner(System.in);
		Animation.animate("\nEnter the numerator ----> ");
		num = input.nextInt();
		Animation.animate("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}

class Rational {
	int num;
	int den;
	int gcf;

	public void displayData() {

		
		Animation.animate("\n" + getOriginal() + " equals " + getDecimal());
		Animation.animate("\n\nThe reduced form is " + getReduced());
	}

	public Rational(double eNum, double eDen) {
		num = (int) eNum;
		den = (int) eDen;
	}

	public int getnum() 
	{
		return num;
	}

	public int getden() 
	{
		return den;
	}

	public double getDecimal() {
		double decimal = (double) getnum() / (double) getden();
		return decimal;
	}

	public String getOriginal() {
		String original = getnum() + "/" + getden();
		return original;
	}

	public String getReduced() {
		int gcf = getGCF(num, den);
		int reducedNum = (num / gcf);
		int reducedDen = (den / gcf);
		String reduced = reducedNum + "/" + reducedDen;
		return reduced;
	}

	private int getGCF(int n1, int n2) {
		int rem = 0;
		do {
			rem = (n1 % n2);
			if (rem == 0)
				gcf = n2;
			else {
				n1 = n2;
				n2 = rem;
			}
		} while (rem != 0);

		return gcf;
	}
}

	class Animation
	{
		public static void animate(String s)
		{
			
			int length = s.length();
			int x = 0;
			String animate = "";
			
			while (x <= length-1)
			{
				
					if (x == length-1)
					{
						animate =  s.substring(x);
						System.out.print(animate);
					}
					else
					{
						animate =  s.substring(x,x+1);
						System.out.print(animate);
					}
						
							
				delay(50);
				x++;
			}
		}
		
		public static void delay(int time)
		{
			long startDelay = System.currentTimeMillis();
			long endDelay = 0;
			while (endDelay - startDelay < time)
				endDelay = System.currentTimeMillis();
		}
		
		
	}

