package ejecutable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import productosBase.*;
import productosDerivados.*;


public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
		
		listaDeProductos.add(new Bebida("Coca-Cola Zero", 1.5 , 20));
		listaDeProductos.add(new Bebida("Coca-Cola", 1.5 , 18));
		listaDeProductos.add(new Shampoo("Shampoo Sedal", 500 , 19));
		listaDeProductos.add(new Fruta("Frutilla", 64 , "kilo"));
		
		imprimirLista(listaDeProductos);
		
	}
	
	private static void imprimirLista(List<Producto> lista) {
		imprimirListaCompleta(lista);
		System.out.println("\n=============================\n");
		obtenerMasCaroYMasBarato(ordenarLista(lista));
	}

	private static List<Producto> ordenarLista(List<Producto> lista) {
		Collections.sort(lista);
		Collections.reverse(lista);
		return lista;
	}
	
	private static void imprimirListaCompleta(List<Producto> listaDeProductos) {
		for(Producto productoActual : listaDeProductos) {
			System.out.println(productoActual);
			System.out.println("asd");
		}
	}
	
	private static void obtenerMasCaroYMasBarato(List<Producto> listaOrdenada) {
		int masCaro = 0;
		int masBarato = listaOrdenada.size()-1;
		System.out.println("Producto más caro: " + listaOrdenada.get(masCaro).getNombre() + "\nProducto más barato: " + listaOrdenada.get(masBarato).getNombre());
	}
	

	
}
