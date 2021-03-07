import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                Fraction1 fraction = new Fraction1();
                complexNumber complex = new complexNumber();
                int repeatProgram = 1;
                while (repeatProgram == 1) {
                    System.out.println("Enter 1 for fraction and 2 for complex number!");
                    int whatCalc = scanner.nextInt();
                  if (whatCalc == 1) {
                        System.out.print("Enter first fraction numerator: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter first fraction denominator: ");
                        int denom1 = scanner.nextInt();
                        while (denom1 == 0) {
                            System.out.println("Enter valid denominator! ");
                            denom1 = scanner.nextInt();
                        }
                        System.out.print("Enter second fraction numerator: ");
                        int num2 = scanner.nextInt();
                        System.out.print("Enter second fraction denominator: ");
                        int denom2 = scanner.nextInt();
                        while (denom2 == 0) {
                            System.out.println("Enter valid denominator! ");
                            denom2 = scanner.nextInt();
                        }
                         Fraction fraction2 = new Fraction(num1, denom1);
                         Fraction fraction1 = new Fraction(num2, denom2);
                        System.out.println("If you would like to add enter: 1");
                        System.out.println("If you would like to subtract enter: 2");
                        System.out.println("If you would like to multiply enter: 3");
                        System.out.println("If you would like to divide enter: 4");
                        System.out.print("What operation would you like to do: ");
                        int fractionOperation = scanner.nextInt();
                        while (!(fractionOperation >= 1 && fractionOperation <= 4)) {
                            System.out.println("Enter valid operation number! ");
                            fractionOperation = scanner.nextInt();
                        }
                        if (fractionOperation == 1){
                           // fraction.add(num1, denom1, num2, denom2);
                            System.out.println(fraction1.add(fraction2));
                           /* int num = fraction.num;
                            int denom = fraction.denom;
                           fraction.simplify(num, denom);
                        */ }
                        if (fractionOperation == 2){
                          fraction.subtract(num1, denom1, num2, denom2);
                            int num = fraction.num;
                            int denom = fraction.denom;
                            fraction.simplify(num, denom);
                        }
                        if (fractionOperation == 3){
                          fraction.multiply(num1, denom1, num2, denom2);
                            int num = fraction.num;
                            int denom = fraction.denom;
                            fraction.simplify(num, denom);
                        }
                        if (fractionOperation == 4){
                          fraction.divide(num1, denom1, num2, denom2);
                            int num = fraction.num;
                            int denom = fraction.denom;
                            fraction.simplify(num, denom);
                        }
                    }


                    if (whatCalc == 2) {
                        System.out.println("Enter first real number ");
                        double real1 = scanner.nextDouble();
                        System.out.println("Enter first complex number ");
                        double complex1 = scanner.nextDouble();
                        System.out.println("Enter second real number ");
                        double real2 = scanner.nextDouble();
                        System.out.println("Enter second complex number ");
                        double complex2 = scanner.nextDouble();
                        System.out.println("If you would like to add enter: 1");
                        System.out.println("If you would like to subtract enter: 2");
                        System.out.println("If you would like to multiply enter: 3");
                        System.out.println("If you would like to divide enter: 4");
                        System.out.print("What operation would you like to do: ");
                        int complexOperation = scanner.nextInt();
                        while (!(complexOperation >= 1 && complexOperation <= 4)) {
                            System.out.println("Enter valid operation number! ");
                            complexOperation = scanner.nextInt();
                        }
                        if (complexOperation == 1){
                            complex.add(real1, complex1, real2, complex2);
                        }
                        if (complexOperation == 2){
                            complex.subtract(real1, complex1, real2, complex2);
                        }
                        if (complexOperation == 3){
                            complex.multiply(real1, complex1, real2, complex2);
                        }
                        if (complexOperation == 4){
                            complex.divide(real1, complex1, real2, complex2);
                        }
                    }
                    System.out.println("Enter 0 to quit and 1 to continue");
                    repeatProgram = scanner.nextInt();
                }

            } catch (InputMismatchException e) {
                System.out.println("Please Enter a valid Integer value! ");
                System.out.println("Program is exiting! ");
                System.exit(0);
            }
        }
    }


