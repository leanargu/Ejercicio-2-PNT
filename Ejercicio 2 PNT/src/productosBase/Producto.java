package productosBase;

public abstract class Producto implements Comparable<Producto>{

	private String nombre;
	private double precio;
	
	public Producto(String nombreNuevo, double precioNuevo) {
		super();
		this.nombre = nombreNuevo;
		this.precio = precioNuevo;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
