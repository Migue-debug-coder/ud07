package ejercicios07.avanzados;

import java.util.List;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;
import ejercicios07.dataset.Pedido;
import ejercicios07.dataset.Producto;

public class Main {

	public static void main(String[] args) {

	}
	
	// Contar cuántos departamentos distintos existen en la empresa.
	public static long ejercicio25() {
	    return Dataset.getEmpleados().stream()
	            .map(Empleado::getDepartamento) 
	            .distinct()                      
	            .count();                      
	}
	
	// Obtener los 3 empleados con el salario más alto.
	public static List<Empleado> ejercicio26() {
	    return Dataset.getEmpleados().stream()
	            .sorted((e1, e2) -> Double.compare(e2.getSalario(), e1.getSalario()))
	            .limit(3) 
	            .toList();
	}
	
	// Nombres de los 2 productos más baratos, ignorando el primero absoluto.
	public static List<String> ejercicio27() {
	    return Dataset.getProductos().stream()
	            .sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio())) 
	            .skip(1)               
	            .limit(2)             
	            .map(Producto::getNombre)  
	            .toList();
	}
	
	// Clientes únicos con pedidos "PENDIENTE", ordenados alfabéticamente.
	public static List<String> ejercicio28() {
	    return Dataset.getPedidos().stream()
	            .filter(p -> p.getEstado().equals("PENDIENTE")) 
	            .map(Pedido::getCliente)                      
	            .distinct()                                    
	            .sorted()                                       
	            .toList();
	}
	
	// Lista con el nombre del producto más caro que empieza por la letra "A".
	public static List<String> ejercicio29() {
	    return Dataset.getProductos().stream()
	            .filter(p -> p.getNombre().toUpperCase().startsWith("A")) 
	            .sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio())) 
	            .limit(1)             
	            .map(Producto::getNombre) 
	            .toList();            
	}
}
