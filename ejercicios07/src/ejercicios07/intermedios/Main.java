package ejercicios07.intermedios;

import java.util.List;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Pedido;
import ejercicios07.dataset.Producto;

public class Main {

	public static void main(String[] args) {

		
		

	}
	
	//Contar cuántos pedidos están en estado "PENDIENTE".
	public static long ejercicio11() {
		return Dataset.getPedidos().stream()
			.filter(p -> p.getEstado().equals("PENDIENTE"))
			.count();
	}
	
	//Comprobar si existe algún producto sin stock (devuelve boolean).
	public static boolean ejercicio12() {
		return Dataset.getProductos().stream()
				.anyMatch(p -> p.getStock() == 0);
	}
	
	//Comprobar si todos los empleados ganan más de 1000 (devuelve boolean).
	public static boolean ejercicio3() {
		return Dataset.getEmpleados().stream()
				.allMatch(e -> e.getSalario() > 1000);
	}
	
	// Comprobar si ningún producto supera los 5000 de precio
	public static boolean ejercicio19() {
	    return Dataset.getProductos().stream()
	            .noneMatch(p -> p.getPrecio() > 5000);
	}
	
	// Obtener una lista de todos los productos 
	// ordenados por su precio de menor a mayor.
	public static List<Producto> ejercicio20() {
	    return Dataset.getProductos().stream()
	            .sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
	            .toList(); 
	}
	
	// Comprobar si algún producto 
	// de la categoría "Alimentación" cuesta menos de 2 euros.
	public static boolean ejercicio21() {
	    return Dataset.getProductos().stream()
	            .filter(p -> p.getCategoria().equals("Alimentación"))
	            .anyMatch(p -> p.getPrecio() < 2);
	}
	
	// Comprobar si todos los empleados 
	// del departamento "IT" tienen un salario superior a 1000 euros.
	public static boolean ejercicio22() {
	    return Dataset.getEmpleados().stream()
	            .filter(e -> e.getDepartamento().equals("IT"))
	            .allMatch(e -> e.getSalario() > 1000);
	}
	
	// Comprobar que ningún producto de la tienda tenga un stock negativo (menor a 0). 
	public static boolean ejercicio23() {
	    return Dataset.getProductos().stream()
	            .noneMatch(p -> p.getStock() < 0);
	}
	
	// Obtener una lista con todos 
	// los pedidos, omitiendo los 5 primeros de la lista original.
	public static List<Pedido> ejercicio24() {
	    return Dataset.getPedidos().stream()
	            .skip(5)
	            .toList();
	}
	
	
	
	
	
	
	
	
	

}
