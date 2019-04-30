package productosDerivados;
import productosBase.ProductoEmbotellado;

public class Bebida extends ProductoEmbotellado{
	
	
	public Bebida(String nombre, double contenidoNuevo ,double precio) {
		super(nombre,contenidoNuevo,precio);
	}

	@Override
	public String toString() {
		return super.toString() + " /// Litros: " + getContenido() + " /// Precio: $"  +getPrecio(); 
	}

	
	
	
	
}
