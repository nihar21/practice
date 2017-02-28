import java.util.Scanner;

/**
    Problem 17
 */
public class Complex {

    private double a;
    private double bi;

    Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public double abs() {
        return Math.sqrt(a * a + bi * bi);
    }

    public Complex add(Complex other) {
        return new Complex(a + other.a, bi + other.bi);
    }
    public Complex add(double real, double imaginary) {
        return new Complex(a + real, bi + imaginary);
    }

    public Complex multiply(Complex other) {
        double real, imaginary;
        real = this.a * other.a - this.bi * other.bi;
        imaginary = this.a * other.bi + this.bi * other.a;
        return new Complex(real, imaginary);
    }
    public Complex multiply(double re, double im) {
        double real, imaginary;
        real = this.a * re - this.bi * im;
        imaginary = this.a * im + this.bi * re;
        return new Complex(real, imaginary);
    }

    public String toString() {
        return this.a + " + " + this.bi + "i";
    }

    public static void main(String[] args) {

        Complex f = new Complex(4, 3);
        Complex s = new Complex(6, 1.5);

        System.out.println("Testing abs, add, and toString");
        System.out.println(f.abs());
        System.out.println(f.add(s));
        System.out.println(f);

        System.out.println("Testing multiply, overloaded add, overloaded multiply");
        System.out.println(f.multiply(s));
        System.out.println(f.add(2, 1));
        System.out.println(f.multiply(2, 1));

        Scanner a = new Scanner(System.in);
        a.hasNext();


    }
}
