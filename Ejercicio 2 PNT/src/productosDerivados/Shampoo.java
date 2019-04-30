package productosDerivados;
import productosBase.ProductoEmbotellado;

public class Shampoo extends ProductoEmbotellado{



	public Shampoo(String nombreNuevo, double contenidoNuevo, double precioNuevo) {
		super(nombreNuevo, contenidoNuevo, precioNuevo);
	}

	@Override
	public String toString() {
		return super.toString() + " /// Contenido: " + (int) getContenido() + "ml /// Precio: $"  + getPrecio(); 
	}

	
}
