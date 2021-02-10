public class CalculatorTest 
{
    public static void main(String[] args) 
    {
       Calculator calc = new CalculateImpl();
       int result = calc.calculator(5,6,Operator.ADD);
       result = calc.calculator(result,6,Operator.MULTIPLY);
       result = calc.calculator(result,1,Operator.SUBTRACT);
       result = calc.calculator(result,5,Operator.DIVIDE);
       System.out.println("result=" + result);
    }
}