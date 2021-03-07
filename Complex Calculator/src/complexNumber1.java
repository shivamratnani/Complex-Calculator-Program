public class complexNumber1 {
    public void add(double real1, double complex1, double real2, double complex2){
        double realnum = real1 + real2;
        double complexnum = complex1 + complex2;
        System.out.println((realnum + " + (" + complexnum + ") i"));
    }

    public void subtract(double real1, double complex1, double real2, double complex2){
        double realnum = real1 - real2;
        double complexnum = complex1 - complex2;
        System.out.println(realnum + " + (" + complexnum + ") i");
    }

    public void multiply(double real1, double complex1, double real2, double complex2){
        double realnum = (real1 * real2) - (complex1 * complex2);
        double complexnum = (real1 * complex2) + (real2 * complex1);
        System.out.println(realnum + " + (" + complexnum + ") i");
    }

    public void divide(double real1, double complex1, double real2, double complex2){
        complex2 = -1 * complex2;
        //"Implements" this stuff [
        double realnum = (real1 * real2) - (complex1 * complex2);
        double complexnum = (real1 * complex2) + (real2 * complex1);
        //]
        double denominator = real2*real2 + complex2*complex2;
        realnum = realnum/denominator;
        complexnum = complexnum/denominator;
    }

    //how to get realnum and complexnum values
    public void print (int realnum, int complexnum) {
        //Prints -> Implement this?
        int plusPrint = 0;
        if (realnum != 0 && complexnum != 0) plusPrint = 1;
        System.out.println(" ");
        if (realnum != 0) System.out.print(realnum);
        if (plusPrint == 1) System.out.print(" + ");
        if (complexnum != 0) System.out.print("(" + complexnum + ") i");
        System.out.println(" ");
    }


}
