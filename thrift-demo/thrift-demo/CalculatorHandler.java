package calculator;

public class CalculatorHandler implements Calculate.Iface{

	public CalculatorHandler(){

	}

	public double add(double op1, double op2){
		System.out.println("adding " + op1 + "and " + op2);
		return op1 + op2;
	}

	public double sub(double op1, double op2){
		System.out.println("subtracting " + op1 + "and " + op2);
		return op1 - op2;
	}

	public double mul(double op1, double op2){
		System.out.println("multiplying " + op1 + "and " + op2);
		return op1 * op2;
	}

	public double div(double op1, double op2) throws DivByZero{

		if(op2 == 0){
			DivByZero dz = new DivByZero();
			dz.message = "can't divide by zero";
			throw dz;
		}
		System.out.println("dividing " + op1 + "and " + op2);
		return op1+op2;
	}

}