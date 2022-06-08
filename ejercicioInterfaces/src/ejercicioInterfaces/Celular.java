package ejercicioInterfaces;

public class Celular implements IArtefacto {

	String nombre="";
	int volumen = 0;
	double precio = 0.0;
	
	public Celular(String nombre, int volumen, double precio) {
		super();
		this.nombre = nombre;
		this.volumen = volumen;
		this.precio = precio;
	}
	
	public Celular(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Celular(int precio) {
		super();
		this.precio = precio;
	}

	public void calcularPromocion() {
		double res;
		if(precio > 500) {
			res = precio - (precio * 0.05);
			System.out.println("El precio promoción es: " + res);
		}else {
			System.out.println("No aplica a la promoción");
		}
	}
	
	public void calcularPromocion(String nombre, double promo) {
		double res;
		if(precio > 500 && nombre == "Samsung") {
			res = precio - (precio*promo);
			System.out.println("El precio promoción es: " + res);
		}else {
			System.out.println("No aplica a la promoción");
		}
	}
	
	public void calcularPromocion(double promo, double dscto) {
		double res = 0.0;
		double res_dscto = 0.0;
		if(precio > 500) {
			res = (precio * promo);
			
		}else {
			res = precio;
		}
		res_dscto = precio * dscto;
		System.out.println("El precio final es: " + (res - res_dscto));
	}
	
	@Override
	public void nombreArtefacto() {
		// TODO Auto-generated method stub
		System.out.println(nombre);
	}
	
	
}
