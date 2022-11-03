package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double fraction() {
		double fraction = (double)(this.numerator/this.denominator);
		return fraction;
	}
	
	public String addition(Fraction fraction1) {
		if (fraction1.denominator == this.denominator) {
			int sumNumerator = fraction1.numerator + this.numerator;
			return sumNumerator + "/" + this.denominator;
		}
		else {
			int finalDenominator = fraction1.denominator * this.denominator;
			int sumNumerator = fraction1.numerator * this.denominator + this.numerator * fraction1.denominator;
			return sumNumerator + "/" + finalDenominator;
		}
	}
	
	public double multiplication(Fraction fraction2) {
		double product = this.fraction() * fraction2.fraction();
		return product;
	}
	
	public double reciprocal() {
		double reciprocal = 1/this.fraction();
		return reciprocal;
	}
	
	public String simplification() {
		
		return null;
		
	}
	
}
