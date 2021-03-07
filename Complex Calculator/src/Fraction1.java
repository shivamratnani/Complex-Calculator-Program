public class Fraction1 { //Define
    int num;
    int denom;
    public int add(int num1, int denom1, int num2, int denom2) {
        num = (num1 * denom2) + (num2 * denom1);
        denom = denom1 * denom2;

        // System.out.println(num + "/" + denom);
    return num & denom;
    }

    public int subtract(int num1, int denom1, int num2, int denom2){
        num = (((num1 * denom2) - (num2 * denom1)));
        denom = denom1 * denom2;
        //Simplify
        // System.out.println(num + "/" + denom);
        return num & denom;
    }

    public int multiply(int num1, int denom1, int num2, int denom2){
        num = num1 * num2;
        denom = denom1 * denom2;
        //Simplify
        // System.out.println(num + "/" + denom);
        return num & denom;
    }

    public int divide(int num1, int denom1, int num2, int denom2){
        num = num1 * num2;
        denom = denom1 * denom2;
        //Simplify
        // System.out.println(num + "/" + denom);
        return num & denom;
    }

    public void simplify(int num, int denom){
    int gcm = 0;
        for(int i=1; i<=num || i<=denom; i++) {
            if (num % i == 0 && denom % i == 0) {
                gcm = i;
                num = num / gcm;
                denom = denom / gcm;
            }
        }
        System.out.println(num + "/" + denom);

    }
}

/*
int addNewDenom = 1;
        for (int x = 2; x <= addnum; x++) {
            if ((addnum % x == 0) && (adddenom % x == 0)) {
                addNewDenom = x;
                addnum = addnum / addNewDenom;
                adddenom = adddenom / addNewDenom;
            }
        }
 */