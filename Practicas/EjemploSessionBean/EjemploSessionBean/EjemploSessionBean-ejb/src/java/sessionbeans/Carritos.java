/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import domainmodel.Carrito;
import domainmodel.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Angelo
 */
@Stateful
public class Carritos implements ICarritosLocal, ICarritosRemote {

    private HashMap<String, Carrito> carritos;

    public Carritos() {
        carritos = new HashMap<String, Carrito>();
    }

    @Override
    public void usarCarrito(String id) {
        Carrito carrito = this.carritos.get(id);
        if (carrito == null) {
            carrito = new Carrito();
            this.carritos.put(id, carrito);
        }
    }

    @Override
    public void anadirProductoCarrito(String id, Producto p) {
        Carrito carrito = this.carritos.get(id);
        if (carrito != null) {
            carrito.anadirProductoCarrito(p);
        }
    }

    @Override
    public void eliminarProductoCarrito(String id, Producto p) {
        Carrito carrito = this.carritos.get(id);
        if (carrito != null) {
            carrito.eliminarProductoCarrito(p);
        }
    }

    @Override
    public double getPrecioProducto(String id) {
        Carrito carrito = this.carritos.get(id);
        if (carrito != null) {
            return carrito.getPrecioTotalCarrito();
        } else {
            return 0.0d;
        }
    }

    @Override
    public List<Producto> getProductos(String id) {
        Carrito carrito = this.carritos.get(id);
        if (carrito == null) {
            return new ArrayList<Producto>();
        } else {
            return carrito.getProductos();
        }
    }

    @Override
    public void remove(String id) {
        Carrito carrito = this.carritos.get(id);
        if (carrito != null) {
            this.carritos.remove(id);
        }
    }

    @Override
    public void remove() {
        this.carritos = null;
    }

    @Override
    public double getPrecioTotalCarrito(String id) {
        Carrito carrito = this.carritos.get(id);
        if (carrito != null) {
            return carrito.getPrecioTotalCarrito();
        } else return 0.0d;
    }

}
