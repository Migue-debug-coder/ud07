package ejercicios07.avanzados;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;

public class Main {

	public static void main(String[] args) {

	}
	
	// Contar cuántos departamentos distintos existen en la empresa.
	public static long ejercicio25() {
	    return Dataset.getEmpleados().stream()
	            .map(Empleado::getDepartamento) // Extraemos solo el nombre del departamento 
	            .distinct()                     // Eliminamos los nombres duplicados 
	            .count();                       // Contamos cuántos elementos quedan en el stream 
	}
	
}
