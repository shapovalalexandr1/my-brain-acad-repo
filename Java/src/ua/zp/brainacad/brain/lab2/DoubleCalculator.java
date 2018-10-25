package ua.zp.brainacad.brain.lab2;

// TODO analog of previously calculators, but use Double type for it.
public class DoubleCalculator
{
    // TODO sum, sub, div, mul
    /**
     * Sum two values.
     *
     * @param a first addend.
     * @param b second addend.
     * @return sum.
     */
    public Double sum (Double a, Double b) {
        return a + b;
    }


    /**
     * Subtraction second value from first.
     *
     * @param a decreasing.
     * @param b subtrahend.
     * @return residual result.
     */
    public Double sub(Double a, Double b) {
        return a - b;
    }

    /**
     * Multiply two values.
     *
     * @param a first multiplier.
     * @param b second multiplier.
     * @return result of multiply.
     */
    public Double mul(Double a, Double b) {
        return a * b;
    }

    /**
     * Divide first value by second.
     *
     * @param a dividend.
     * @param b divider.
     * @return dividing result.
     */
    public Double div(Double a, Double b) {
        return a / b;
    }
}
