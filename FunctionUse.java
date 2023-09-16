package fractioin4;

public class FunctionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,6);
		f1.print();
//		f1.setNumerator();
//		f1.getNumerator();
		Fraction f2 = new Fraction(4,8);
//		f1.add(f2);
//		f1.print();
 		Fraction f3 = Fraction.add(f1, f2);
 		f3.print();
 		f1.increment();
		f1.print();
	}
}
class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int numerator,int denominator) {
		if(denominator == 0) {
			// Throw Error
			denominator = 1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
		simplify();
	}
	
	public int getNumerator(int num) {
		return numerator;
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			// Throw Error
			return;
		}
		this.denominator = num;
		simplify();
	}
	
	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2;i<=smaller;i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;	
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	
	
	public void add(Fraction f2){
        //First fraction is the fraction on which function is called
        /// Second fraction is passed as arguments
        this.numerator= this.numerator * f2.denominator+this.denominator*f2.numerator;
        this.denominator= this.denominator * f2.denominator;
        simplify();
    }
	
	public static Fraction add(Fraction f1,Fraction f2) {
		int newNum = f1.numerator * f2.denominator+f1.denominator*f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum,newDeno);
		return f3;
		
	}
}
