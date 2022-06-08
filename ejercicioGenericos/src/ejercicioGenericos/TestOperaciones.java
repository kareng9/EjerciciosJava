package ejercicioGenericos;

public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcularOperaciones<Integer, Double> c = new CalcularOperaciones<Integer, Double>();
		Number res1 = c.sumarNumeros(45, 5);
		System.out.println("El resultado de la suma es :"+res1);
		Number res2 = c.restarNumeros(45, 5);
		System.out.println("El resultado de la suma es :"+res2);
		Number res3 = c.multiplicarNumeros(45, 5);
		System.out.println("El resultado de la suma es :"+res3);
		Number res4 = c.dividirNumeros(45, 5);
		System.out.println("El resultado de la suma es :"+res4);
	}

}
