package Assignment_15.exercism;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if(operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if(!operation.equals("+") && !operation.equals("*") && !operation.equals("/")){
            throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
        if(operation.equals("+")){
            return operand1+" "+operation+" "+operand2+" = "+Integer.toString(operand1+operand2);
        }
        else if(operation.equals("*")){
            return operand1+" "+operation+" "+operand2+" = "+Integer.toString(operand1*operand2);
        }
        if(operand2==0){
            throw new IllegalOperationException("Division by zero is not allowed",new ArithmeticException());
        }
        return operand1+" "+operation+" "+operand2+" = "+Integer.toString(operand1/operand2);
    }
}

