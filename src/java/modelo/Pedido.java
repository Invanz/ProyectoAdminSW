package modelo;

import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Producto> productos;
    private Usuario cliente;
    private String estado;
    private String direccionEnvio;
    
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	
	public Pedido(List<Producto> productos, Usuario cliente, String direccionEnvio) {
		super();
		// this.numeroPedido = numeroPedido;  en caso de que se vaya a usar
		this.productos = productos;
		this.cliente = cliente;
		this.estado = "pendiente";
		this.direccionEnvio = direccionEnvio;
	}

}
