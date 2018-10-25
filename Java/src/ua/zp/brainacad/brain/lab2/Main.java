package ua.zp.brainacad.brain.lab2;

/**
 * Base class for test busyness logic of app.
 */
public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 2;
        Double d = 4.2;
        Double c = 2.7;

        System.out.println("Create instance of IntegralCalculator");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("Create instance of BooleanCalculator");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        System.out.println("Create instance of DoubleCalculator");
        DoubleCalculator doubleCalculator = new DoubleCalculator();


        System.out.println("\nTry calc int sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);
        System.out.println('\n');

        System.out.println("\nTry calc Double sum:");
        Double double_sum = doubleCalculator.sum(c, d);
        ResultPrinter.print(c, "+", d, double_sum);
        System.out.println('\n');

        //TODO call sub

        System.out.println("\nTry calc int sub:");
        int sub = calculator.sub(a, b);
        ResultPrinter.print(a, "-", b, sub);
        System.out.println('\n');

        System.out.println("Try calc int multiply:");
        int multiply = calculator.mul(a, b);
        ResultPrinter.print(a, "*", b, multiply);
        System.out.println('\n');

        //TODO call div

        System.out.println("\nTry calc int div:");
        int div = calculator.div(a, b);
        ResultPrinter.print(a, "/", b, div);
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc boolean <<:");
        ResultPrinter.printBinary(a,"<<", b, booleanCalculator.shiftLeft(a, b));
       // booleanCalculator.shiftLeft(2, 4);
        System.out.println('\n');

        //TODO call >>

        System.out.println("Try calc boolean >>:");
        ResultPrinter.printBinary(a,">>", b, booleanCalculator.shiftRight(a, b));
       // booleanCalculator.shiftRight(2, 4);
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean XOR:");
        ResultPrinter.printBinary(a,"^", b, booleanCalculator.xor(a, b));
        System.out.println('\n');

        //TODO call inverse
        System.out.println("Try calc boolean inverse:");
        int inverse = booleanCalculator.inverse(a);
        ResultPrinter.printBinary(a, "~", inverse);
        System.out.println('\n');

        System.out.println("Try calc boolean and:");
        int and = booleanCalculator.and(a, b);
        ResultPrinter.printBinary(a, "&", b, and);
        System.out.println('\n');

        System.out.println("Try calc boolean or:");
        int or = booleanCalculator.and(a, b);
        ResultPrinter.printBinary(a, "|", b, or);
        System.out.println('\n');
    }
}
