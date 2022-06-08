package ejercicioGenericos;

public class CalcularOperaciones <T extends Number, K extends Number> {
	
	public Number sumarNumeros(Number num1, Number num2) {
		Number resultado;
		resultado = num1.doubleValue() + num2.doubleValue();
		return resultado;
	}
	public Number restarNumeros(Number num1, Number num2) {
		Number resultado;
		resultado = num1.doubleValue() - num2.doubleValue();
		return resultado;
	}
	public Number multiplicarNumeros(Number num1, Number num2) {
		Number resultado;
		resultado = num1.doubleValue() * num2.doubleValue();
		return resultado;
	}
	public Number dividirNumeros(Number num1, Number num2) {
		Number resultado;
		resultado = num1.doubleValue() / num2.doubleValue();
		return resultado;
	}
	
}
