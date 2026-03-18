package ejercicios07.dataset;

import java.util.Arrays;
import java.util.List;

public class Dataset {

	public static List<Empleado> getEmpleados() {
		return Arrays.asList(new Empleado("Ana", "IT", 3200.50, 28), new Empleado("Juan", "Ventas", 1800.00, 35),
				new Empleado("Pedro", "Finanzas", 2900.00, 42), new Empleado("Marta", "IT", 3500.00, 31),
				new Empleado("Luis", "RRHH", 1450.00, 25), new Empleado("Elena", "Ventas", 1950.00, 38),
				new Empleado("Carlos", "IT", 2800.00, 27), new Empleado("Sofia", "Finanzas", 4200.00, 45),
				new Empleado("David", "IT", 1200.00, 23), new Empleado("Lucia", "Ventas", 2100.00, 33),
				new Empleado("Jorge", "RRHH", 1600.00, 29), new Empleado("Carmen", "Finanzas", 3100.00, 39),
				new Empleado("Raul", "IT", 3800.00, 34), new Empleado("Alba", "Ventas", 1400.00, 26),
				new Empleado("Diego", "RRHH", 2100.00, 41));
	}

	public static List<Producto> getProductos() {
		return Arrays.asList(new Producto("Laptop Pro", "Electrónica", 1500.00, 10),
				new Producto("Ratón Inalámbrico", "Electrónica", 25.50, 50),
				new Producto("Teclado Mecánico", "Electrónica", 85.00, 0), // Sin stock
				new Producto("Monitor 4K", "Electrónica", 350.00, 15),
				new Producto("Silla Ergonómica", "Hogar", 199.99, 5),
				new Producto("Mesa Escritorio", "Hogar", 120.00, 0), // Sin stock
				new Producto("Lámpara LED", "Hogar", 15.00, 100), new Producto("Libro Java 21", "Libros", 45.00, 20),
				new Producto("Libro Patrones", "Libros", 55.00, 12),
				new Producto("Manzanas (1kg)", "Alimentación", 2.50, 200),
				new Producto("Agua Mineral", "Alimentación", 1.20, 500), // Empieza por A
				new Producto("Auriculares Bluetooth", "Electrónica", 60.00, 30), // Empieza por A
				new Producto("Micrófono USB", "Electrónica", 45.00, 8),
				new Producto("Altavoz Inteligente", "Electrónica", 90.00, 25), // Empieza por A
				new Producto("Alfombrilla XXL", "Electrónica", 18.00, 0) // Empieza por A y sin stock
		);
	}

	public static List<Pedido> getPedidos(List<Producto> p) {
		return Arrays.asList(new Pedido(1, "Juan", Arrays.asList(p.get(0), p.get(1)), "ENTREGADO"), // Laptop, Ratón
				new Pedido(2, "Maria", Arrays.asList(p.get(4), p.get(6)), "PENDIENTE"), // Silla, Lámpara
				new Pedido(3, "Pedro", Arrays.asList(p.get(7), p.get(8)), "ENVIADO"), // Libros
				new Pedido(4, "Ana", Arrays.asList(p.get(10), p.get(9), p.get(9)), "ENTREGADO"), // Agua, Manzanasx2
				new Pedido(5, "Juan", Arrays.asList(p.get(3), p.get(11)), "PENDIENTE"), // Monitor, Auriculares
				new Pedido(6, "Laura", Arrays.asList(p.get(0), p.get(3), p.get(4)), "ENVIADO"), // Laptop, Monitor,
																								// Silla
				new Pedido(7, "Carlos", Arrays.asList(p.get(1)), "ENTREGADO"), // Ratón
				new Pedido(8, "Sofia", Arrays.asList(p.get(12), p.get(13)), "PENDIENTE"), // Micro, Altavoz
				new Pedido(9, "Juan", Arrays.asList(p.get(7)), "ENVIADO"), // Libro Java (Juan repite)
				new Pedido(10, "Elena", Arrays.asList(p.get(4), p.get(4)), "PENDIENTE"), // 2 Sillas
				new Pedido(11, "Diego", Arrays.asList(p.get(0), p.get(1), p.get(3), p.get(13)), "ENTREGADO"), // Compra
																												// grande
				new Pedido(12, "Carmen", Arrays.asList(p.get(6), p.get(9)), "PENDIENTE"), // Lámpara, Manzanas
				new Pedido(13, "Luis", Arrays.asList(p.get(8)), "ENVIADO"), // Libro Patrones
				new Pedido(14, "Marta", Arrays.asList(p.get(11), p.get(12)), "ENTREGADO"), // Auriculares, Micro
				new Pedido(15, "Pedro", Arrays.asList(p.get(0)), "PENDIENTE") // Laptop
		);
	}

}
