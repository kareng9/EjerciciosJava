package ejercicioInterfaces;

public interface IArtefacto {
	
	String nombre="";
	int volumen = 0;
	double precio = 0.0;
	
	public void nombreArtefacto();
	
	default void calcularRuido(int volumen) { 
		nombreArtefacto();
		if(volumen > 75 && volumen <= 100) {
			System.out.println("Ruido excesivo");
		}else {
			if(volumen >= 50 && volumen < 74) {
				System.out.println("Ruido moderado");
			}else {
				System.out.println("Ruido demasiado bajo");
			}
		}
		}
	
	default void calcularPrecioFinal(double precio) {
		double total = precio + (precio * 0.12);
		System.out.println("El precio total del artefacto es :" + total);
	}
	
}
