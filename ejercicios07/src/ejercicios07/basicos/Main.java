package ejercicios07.basicos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;
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
	
	
	
	
	
	
	
	
	
	
	

}
