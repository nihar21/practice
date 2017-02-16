import java.util.Scanner;

public class Fraction {

    private int num;
    private int denom;

    public Fraction() {
        num = 0;
        denom = 1;
    }

    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.denom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public String toString() {
        return this.getNum() + "/" + this.getDenom();
    }

    public static Fraction subtract(Fraction f, Fraction l) {
        Fraction nf = new Fraction(f.getNum() * l.getDenom() - l.getNum() * f.getDenom(), f.getDenom() * l.getDenom());
        return reduce(nf);
    }

    public static Fraction divide(Fraction f, Fraction l) {
        if (l.getNum() == 0) {
            throw new IllegalArgumentException();
        }
        Fraction nf = new Fraction(f.getNum() * l.getDenom(), f.getDenom() * l.getNum());
        return reduce(nf);
    }

    public static Fraction reduce(Fraction fraction) {
        int gcd = getGCD(fraction.getNum(), fraction.getDenom());
        Fraction nf = new Fraction(fraction.num / gcd, fraction.denom / gcd);
        System.out.println("Reduced by " + gcd);
        return nf;
    }

    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        }
        return getGCD(a % b, b % a);
    }


    public static void main(String[] args) {

        System.out.println("Subtracting 3/4 by 1/2");
        Fraction frac1 = new Fraction(3, 4);
        Fraction frac2 = new Fraction(1, 2);
        System.out.println(subtract(frac1, frac2));


        System.out.println("Dividing 4/5 by 1/7");
        frac1 = new Fraction(4, 5);
        frac2 = new Fraction(1, 7);
        System.out.println(divide(frac1, frac2));

        System.out.println(Fraction.getGCD(3, 12));
        
    }

}
