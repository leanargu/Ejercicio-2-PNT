package productosBase;
public class ProductoEmbotellado extends Producto{

	private double contenido;
	
	public ProductoEmbotellado(String nombreNuevo,double contenidoNuevo,double precioNuevo) {
		super(nombreNuevo, precioNuevo);
		this.setContenido(contenidoNuevo);
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
	

}
