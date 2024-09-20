package cat.proven.calculator.model;

/**
 *
 * @author vimago
 */
public class Calculator {

    /**
     * Does the sum operation
     *
     * @param firstOperand first operand
     * @param secondOperand second operand
     * @return the sum of the two operands
     */
    public double getSum(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Does the rest operation
     *
     * @param firstOperand first operand
     * @param secondOperand second operand
     * @return the rest of the two operands
     */
    public double getRes(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Does the multiplication operation
     *
     * @param firstOperand first operand
     * @param secondOperand second operand
     * @return the multiplication of the two operands
     */
    public double getMult(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * Does the division operation
     *
     * @param firstOperand first operand
     * @param secondOperand second operand
     * @return the division of the two operands
     */
    public double getDiv(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

}
