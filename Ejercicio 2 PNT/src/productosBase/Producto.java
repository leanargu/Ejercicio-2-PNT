package productosBase;

public abstract class Producto implements Comparable<Producto>{

	private String nombre;
	private double precio;
	
	public Producto(String nombreNuevo, double precioNuevo) {
		this.nombre = nombreNuevo;
		this.precio = precioNuevo;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public int compareTo(Producto productoComparable) {
		if(this.precio > productoComparable.getPrecio()) {
			return 1;
		}else if(this.precio < productoComparable.getPrecio()) {
			return -1;
		}
		return nombre.compareTo(productoComparable.getNombre());
	}



	@Override
	public String toString() {
		return "Nombre: " + nombre;
	}
	
	
}
