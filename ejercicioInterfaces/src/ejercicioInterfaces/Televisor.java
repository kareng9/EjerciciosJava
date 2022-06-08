package ejercicioInterfaces;

public class Televisor implements IArtefacto {
	
	String nombre="";
	int volumen = 0;
	double precio = 0.0;
	
	public Televisor(String nombre, int volumen, double precio) {
		super();
		this.nombre = nombre;
		this.volumen = volumen;
		this.precio = precio;
	}

	@Override
	public void nombreArtefacto() {
		System.out.println(nombre);
		
	}

}
