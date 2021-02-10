public class CalculateImpl implements Calculator
{
    public int calculator(int operand1, int operand2, Operator operator) 
    {
        switch (operator) 
        {
        case ADD:
            return operand1 + operand2;
        case SUBTRACT:
            return operand1 - operand2;
        case MULTIPLY:
            return operand1 * operand2;
        case DIVIDE:
            return operand1 / operand2;
        }
        throw new RuntimeException(operator + "is unsupported");
    }
}