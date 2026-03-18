package ejercicios07.dataset;

import java.util.List;

public class Pedido {
	private int id;
	private String cliente;
	private List<Producto> productos;
	private String estado;

	public Pedido(int id, String cliente, List<Producto> productos, String estado) {
		this.id = id;
		this.cliente = cliente;
		this.productos = productos;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getCliente() {
		return cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Pedido " + id + " [" + estado + "] - Cliente: " + cliente;
	}
}