public class Complex extends Number implements Cloneable, Comparable<Complex>{
    // Data fields
    private double a;
    private double b;

    // Constructors
    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    Complex(double a) {
        this.a = a;
        this.b = 0;
    }
    Complex() {
        this.a = 0;
        this.b = 0; 
    }

    // Getters
    /** Returns real part of complex number */
	public double getRealPart() {
		return a;
	}
	/** Returns imaginary part of complex number */
	public double getImaginaryPart() {
		return b;
	}

    // Methods
    /** Adds passed complex number to complex number */
    public Complex add(Complex passedComplex) {
        return new Complex(a + passedComplex.a, b + passedComplex.b); 
    }
    /** Subtracts passed complex number from complex number */
    public Complex subtract(Complex passedComplex) {
        return new Complex(a - passedComplex.a, b - passedComplex.b);
    }
    /** Multiplies passed complex number by complex number */
    public Complex multiply(Complex passedComplex) {
        return new Complex(a * passedComplex.a - b * passedComplex.b, b * passedComplex.a + a * passedComplex.b);
    }
    /** Divides passed complex number by complex number */
    public Complex divide(Complex passedComplex) {
        return new Complex((a * passedComplex.a + b * passedComplex.b) / (Math.pow(passedComplex.a, 2) + Math.pow(passedComplex.b, 2)), (b * passedComplex.a - a * passedComplex.b) / (Math.pow(passedComplex.a, 2) +  Math.pow(passedComplex.b, 2)));
    }

    /** Returns absolute value of complex number */
    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // Override methods
    /** Returns string representation of Complex object */
    @Override
    public String toString() {
        return b == 0 ? a + "" :  a + " + " + b + "i";
    }
    /** Allows Complex objects to be comparable */
    @Override
    public int compareTo(Complex o) {
        if (this.getRealPart() + this.getImaginaryPart() == o.getRealPart() + o.getImaginaryPart()) 
            return 0;
        else if (this.getRealPart() + this.getImaginaryPart() > o.getRealPart() + o.getImaginaryPart()) 
            return 1;
        else 
            return -1;
    }
    /** Allows Complex objects to be cloneable */
    @Override
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}
    @Override
    public int intValue() {
        return 0;
    }
    @Override
    public long longValue() {
        return 0;
    }
    @Override
    public float floatValue() {
        return 0;
    }
    @Override
    public double doubleValue() {
        return 0;
    }
}
