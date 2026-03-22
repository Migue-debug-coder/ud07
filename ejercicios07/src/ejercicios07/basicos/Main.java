package ejercicios07.basicos;

import java.util.ArrayList;
import java.util.List;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;
import ejercicios07.dataset.Pedido;
import ejercicios07.dataset.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Obtener una lista con los nombres de todos los empleados del departamento "IT".
	public static List<String> ejercicio1Declarativo(){
		List<String> nombres = new ArrayList<String>();
		
		for(Empleado e : Dataset.getEmpleados()) {
			if(e.getDepartamento().equals("IT")) {
				nombres.add(e.getNombre());
			}
		}
		
		return nombres;
	}
	
	public static List<String> ejercicio1funcional(){
		return Dataset.getEmpleados().stream() //Stream<Empleado>
				.filter(e -> e.getDepartamento().equals("IT")) //Stream<Empleado> (mas pequeño)
				.map(e ->  e.getNombre()) //Stream<String>
				.toList(); //List<String>
	}
	
	//Obtener una lista con los nombres de todos los productos pasados a mayúsculas.
	public static List<String> ejercicio2() {
		return Dataset.getProductos().stream()
				.map(p -> p.getNombre().toUpperCase())    //Stream de nombres de productos en mayus
				.toList(); //Lista de nombres de productos en mayus
				
	}
	
	//Obtener una lista de las categorías de productos disponibles, sin duplicados.
	public static List<String> ejercicio3() {
		return Dataset.getProductos().stream()  //Stream<Producto>
				.filter(p -> p.getStock() > 0)  //Stream<Producto>
				.map(p -> p.getCategoria() )    //Stream<String>
				.distinct()
				.toList();
 	}
	
	//Obtener los empleados ordenados por salario de mayor a menor.
	public static List<Empleado> ejercicio4(){
		return Dataset.getEmpleados().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalario(), e1.getSalario()) )
				.toList();
				
	}
	
	//Obtener solo los 3 productos más caros de la lista.
	public static List<Producto> ejercicio5(){
		return Dataset.getProductos().stream()
				.sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()) )
				.limit(3)
				.toList();
	}
	
	//Omitir los 2 primeros pedidos de la lista y obtener los demás.
	public static List<Pedido> ejercicio6(){
		return Dataset.getPedidos().stream()
				.skip(2)
				.toList();
	}
	
	
	//Filtrar los productos que tienen stock mayor a 0 y un precio menor a 50.
	public static List<Producto> ejercicio7(){
		return Dataset.getProductos().stream()
				.filter(p -> p.getStock() > 0)
				.filter(p -> p.getPrecio() < 50)
				.toList();
	}
	
	//Obtener una lista con las edades de todos los empleados.
	public static List<Integer> ejercicio8(){
		return Dataset.getEmpleados().stream()
				.map(e -> e.getEdad())
				.toList();
	}
	
	// Filtrar los empleados del departamento "Ventas" 
	// y ordenarlos alfabéticamente por nombre.
	public static List<Empleado> ejercicio9() {
	    return Dataset.getEmpleados().stream()
	            .filter(e -> e.getDepartamento().equals("Ventas"))
	            .sorted((e1, e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre()))
	            .toList();
	}
	
	// Obtener los nombres de los productos que empiezan por la letra "A"
	public static List<String> ejercicio10() {
	    return Dataset.getProductos().stream()
	            .map(p -> p.getNombre())
	            .filter(nombre -> nombre.toUpperCase().startsWith("A"))
	            .toList();
	}
	
	// Obtener una lista con todos los productos de la categoría "Electrónica".
	public static List<Producto> ejercicio11() {
	    return Dataset.getProductos().stream()
	            .filter(p -> p.getCategoria().equals("Electrónica"))
	            .toList();
	}
	
	// Obtener una lista que contenga únicamente los nombres de todos los empleados.
	public static List<String> ejercicio12() {
	    return Dataset.getEmpleados().stream()
	            .map(e -> e.getNombre())
	            .toList();
	}
	
	// Obtener una lista con los nombres de los empleados que pertenecen al departamento de "Ventas".
	public static List<String> ejercicio13() {
	    return Dataset.getEmpleados().stream()
	            .filter(e -> e.getDepartamento().equals("Ventas"))
	            .map(e -> e.getNombre())
	            .toList();
	}
	
	// Obtener una lista con los diferentes estados de los pedidos (sin elementos duplicados).
	public static List<String> ejercicio14() {
	    return Dataset.getPedidos().stream()
	            .map(p -> p.getEstado())
	            .distinct()
	            .toList();
	}
	
	// Contar cuántos empleados tienen estrictamente más de 30 años.
	public static long ejercicio15() {
	    return Dataset.getEmpleados().stream()
	            .filter(e -> e.getEdad() > 30)
	            .count();
	}
	

}
