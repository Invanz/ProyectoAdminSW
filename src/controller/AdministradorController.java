package controller;

import model.Producto;
import model.Pedido;

public class AdministradorController {	
    public void crearProducto(String nombre, String descripcion, double precio, int cantidadDisponible) {
        // Lógica para crear un nuevo producto
    	// Retorna es Producto y no void
    }

    public void modificarProducto(Producto producto, String nuevoNombre, String nuevaDescripcion, double nuevoPrecio, int nuevaCantidad) {
        // Lógica para modificar un producto existente
    	// Retorna Producto
    }

    public void eliminarProducto(Producto producto) {
        // Lógica para eliminar un producto existente
    }
    
    public void buscarPedido (int id) {
    	// Lógica para buscar un pedido
    	// Retorna el pedido
    }
    
    public void despacharPedido(Pedido pedido) {
    	// Lógica para cambiar estado de pedido
    	// Retorna pedido con el nuevo estado
    }

}
