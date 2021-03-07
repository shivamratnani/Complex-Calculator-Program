import java.util.InputMismatchException;

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
        int num1 = ((Fraction) num).num;
        int denom1 = ((Fraction) num).denom;
        int num2 = this.num;
        int denom2 = this.denom;
        int cd = denom1 * denom2;
        int numeratorFinal = (num1 * denom2) + (num2 * denom1);
        return new Fraction(numeratorFinal, cd);
    }

    @Override
    public Number subtract(Number num) {
        return null;
    }

    @Override
    public Number multiply(Number num) {
        return null;
    }

    @Override
    public Number divide(Number num) {
        return null;
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
