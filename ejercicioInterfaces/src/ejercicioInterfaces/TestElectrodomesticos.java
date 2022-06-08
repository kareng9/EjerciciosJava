package ejercicioInterfaces;

public class TestElectrodomesticos {

	public static void main(String[] args) {
		
		Celular c = new Celular("Samsung", 86 , 150.00);
		//c.nombreArtefacto();
		c.calcularRuido(c.volumen);
		c.calcularPrecioFinal(c.precio);
		System.out.println("..........................");
		Celular c2 = new Celular(600);
		c2.calcularPromocion();
		c2.calcularPromocion("LG", 0.02);
		c2.calcularPromocion(0.8, 0.2);
		System.out.println(".......................");
		Televisor t = new Televisor("LG", 50, 1200.50);
		t.calcularRuido(t.volumen);
		t.calcularPrecioFinal(t.precio);
		Computador pc = new Computador("Dell", 20, 750);
		pc.calcularRuido(pc.volumen);
		pc.calcularPrecioFinal(pc.precio);
	}

}
