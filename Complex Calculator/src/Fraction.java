import java.util.*;
public class Fraction implements Number {
    final private int num;
    final private int denom;
    public Fraction(int numerator, int denominator) {
        int gcm = gcm(numerator, denominator);
        this.num = numerator / gcm;
        this.denom = denominator / gcm;
        if (denom == 0) throw new InputMismatchException();
    }
    @Override
    public Number add(Number num) {
        int num1 = this.num;
        int denom1 = this.denom;
        int num2 = ((Fraction) num).num;
        int denom2 = ((Fraction) num).denom;
        int comDenom = denom1 * denom2;
        int numeratorFinal = (num1 * denom2) + (num2 * denom1);
        return new Fraction(numeratorFinal, comDenom);
    }
    @Override
    public Number subtract(Number num) {
        int num1 = this.num;
        int denom1 = this.denom;
        int num2 = ((Fraction) num).num;
        int denom2 = ((Fraction) num).denom;
        int comDenom = denom1 * denom2;
        int numeratorFinal = (num1 * denom2) - (num2 * denom1);
        return new Fraction(numeratorFinal, comDenom);
    }
    @Override
    public Number multiply(Number num) {
        int num1 = this.num;
        int denom1 = this.denom;
        int num2 = ((Fraction) num).num;
        int denom2 = ((Fraction) num).denom;
        int numeratorFinal = num1 * num2;
        int denomFinal = denom2 * denom1;
        int gcm = gcm(numeratorFinal, denomFinal);
        numeratorFinal = numeratorFinal/gcm;
        denomFinal = denomFinal/gcm;
        return new Fraction(numeratorFinal, denomFinal);
    }
    @Override
    public Number divide(Number num) {
        int num1 = this.num;
        int denom1 = this.denom;
        int num2 = ((Fraction) num).num;
        int denom2 = ((Fraction) num).denom;
        int numeratorFinal = num1 * denom2;
        int denomFinal = denom1 * num2;
        int gcm = gcm(numeratorFinal, denomFinal);
        numeratorFinal = numeratorFinal/gcm;
        denomFinal = denomFinal/gcm;
        return new Fraction(numeratorFinal, denomFinal);
    }
    private int gcm(int num, int denom) {
        int gcm = 0;
        for (int i = 1; i <= num || i <= denom; i++) {
            if (num % i == 0 && denom % i == 0) gcm = i;
        }
        return gcm;
    }
    @Override
    public String toString() {
        return this.num + "/" + this.denom;
    }
}
