package productosDerivados;
import productosBase.Producto;

public class Fruta extends Producto{

	private String unidadDeVenta;
	
	public Fruta(String nombreNuevo, double precioNuevo, String unidadDeVentaNueva) {
		super(nombreNuevo, precioNuevo);
		this.unidadDeVenta = unidadDeVentaNueva;
	}
	
	public double calcularCosto(double cantidadDeKilos) {
		return getPrecio()*cantidadDeKilos;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + unidadDeVenta;
	}
	
}
