import java.util.*;
public class TextLab05_Matthew_Pearce {

	 static double num, den;   // numerator and denominator of the rational number

	   public static void main (String args[])
	   {
	      enterData();

	      Rational r = new Rational(num,den);

	      r.displayData();
	   }
	   
		 public static void enterData()
	   {
		  Scanner input = new Scanner(System.in);
	      System.out.print("\nEnter the numerator ----> ");
	      num = input.nextInt();
	      System.out.print("\nEnter the denominator --> ");
	      den = input.nextInt();
	   }
	}



	class Rational
	{
	   double num;
	   double den;
	   int intNum;
	   int intDen;
	   int gcf;	  
	  
	   public void displayData()
	   {
	     
	      System.out.println("\n" + getOriginal() + " equals " + getDecimal());
	      System.out.println("\nThe reduced form is " + getReduced());
	      
	     
	      
	   }
	   
	   public Rational(double eNum , double eDen)
	   {
		   num = eNum;
		   den = eDen;
		   intNum = (int)eNum;
		   intDen = (int)eDen;
	   }
	  public int getintNum()
	  {
		return intNum;  
	  }
	  public int getintDen()
	  {
		return intDen;  
	  }
	  public double getNum()
	  {
		return  num;
	  }
	  
	  public double getDen()
	  {
		return  den;  
	  }
	  
	  public double getDecimal()
	  {
		double decimal = getNum()/getDen();
		return decimal;   
	  }
	  
	  public String getOriginal()
	  {
		String original = getintNum() + "/" + getintDen(); 
		return original;   
	  }
	  
	 public String getReduced()
	  {
		 int gcf = getGCF(intNum, intDen); 
		 int reducedNum = (intNum/gcf);
		 int reducedDen = (intDen/gcf);
		 String reduced =  reducedNum + "/" + reducedDen; 
		 return reduced;
	  }
	  private int getGCF(int n1,int n2)
	   {
	      int rem = 0;
	      do
	      {
	         rem = (n1 % n2);
	         if (rem == 0)
	            gcf = n2;
	         else
	         {
	            n1 = n2;
	            n2 = rem;
	        }
	      }
	      while (rem != 0);
	      
	      return gcf;
	   }
	  
	}
