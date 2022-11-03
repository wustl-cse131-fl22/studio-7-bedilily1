package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public String sum(Complex complex1) {
		double sumReal = this.real + complex1.real;
		double sumImaginary = this.imaginary + complex1.imaginary;
		return sumReal + " + " + sumImaginary + "i";
	}
	
	public String product(Complex complex2) {
		double productReal = this.real * complex2.real - this.imaginary * complex2.imaginary;
		double productComplex = this.real * complex2.imaginary + this.imaginary * complex2.real;
		return productReal + " + " + productComplex + "i";
	}
}
