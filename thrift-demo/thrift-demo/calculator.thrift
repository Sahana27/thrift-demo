namespace java calculator

exception DivByZero{
	1:string message	
}

service Calculate{
	
	double add(1:double op1, 2:double op2),
	double sub(1:double op1, 2:double op2),
	double mul(1:double op1, 2:double op2),
	double div(1:double op1, 2:double op2) throws (1:DivByZero divzero) 
}