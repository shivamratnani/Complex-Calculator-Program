import java.util.*;
public class complexNumber implements Number{
    final private double real;
    final private double complex;
    public complexNumber(double real, double complex) {
        this.real = real;
        this.complex = complex;
    }
    @Override
    public Number add(Number num) {
        double real2 = ((complexNumber) num).real;
        double complex2 = ((complexNumber) num).complex;
        double real1 = this.real;
        double complex1 = this.complex;
        double realnum = real1 + real2;
        double complexnum = complex1 + complex2;
        return new complexNumber(realnum, complexnum);
    }
    @Override
    public Number subtract(Number num) {
        double real2 = ((complexNumber) num).real;
        double complex2 = ((complexNumber) num).complex;
        double real1 = this.real;
        double complex1 = this.complex;
        double realnum = real1 - real2;
        double complexnum = complex1 - complex2;
        return new complexNumber(realnum, complexnum);
    }
    @Override
    public Number multiply(Number num) {
        double real2 = ((complexNumber) num).real;
        double complex2 = ((complexNumber) num).complex;
        double real1 = this.real;
        double complex1 = this.complex;
        double realnum = (real1 * real2) - (complex1 * complex2);
        double complexnum = (real1 * complex2) + (real2 * complex1);
        System.out.println(real1);
        System.out.println(complex1);
        System.out.println(real2);
        System.out.println(complex2);
        return new complexNumber(realnum, complexnum);
    }
    @Override
    public Number divide(Number num) {
        double real2 = ((complexNumber) num).real;
        double complex2 = ((complexNumber) num).complex;
        double real1 = this.real;
        double complex1 = this.complex;
        complex2 = -1 * complex2;
        double realnum = (real1 * real2) - (complex1 * complex2);
        double complexnum = (real1 * complex2) + (real2 * complex1);
        double denominator = real2*real2 + complex2*complex2;
        realnum = realnum/denominator;
        complexnum = complexnum/denominator;
        return new complexNumber(realnum, complexnum);
    }
    @Override
    public String toString() {
        int plusPrint = 0;
        if (this.real == 0 || this.complex == 0) plusPrint = 1;
        if (this.real != 0 && plusPrint == 1) return "\n" + this.real;
        else if (this.complex != 0 && plusPrint == 1) return "\n (" + this.complex + ") i";
        else if (this.real == 0 && this.complex == 0) return "0";
        else return "\n" + this.real +" + (" + this.complex + ") i";
    }
}
