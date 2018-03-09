/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carrito implements Serializable {

    private List<Producto> productos;
    private double valorTotal;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void anadirProductoCarrito(Producto p) {
        if ((p != null) && (this.productos != null)) {
            boolean encontrado = false;
            int i = 0;
            for (Producto producto : this.productos) {
                if (producto.getNombre().equals(p.getNombre())) {
                    encontrado = true;
                    break;
                } else {
                    i++;
                }
            }
            if (encontrado) {
                Producto esteProducto = this.productos.get(i);
                esteProducto.setnUnidades(esteProducto.getnUnidades() + p.getnUnidades());
            } else {
                this.productos.add(p);
            }
        }
    }

    public void eliminarProductoCarrito(Producto p) {
        if ((p != null) && (this.productos != null)) {
            boolean encontrado = false;
            int i = 0;
            for (Producto producto : this.productos) {
                if (producto.getNombre().equals(p.getNombre())) {
                    encontrado = true;
                    break;
                } else {
                    i++;
                }
            }
            if (encontrado) {
                this.productos.remove(i);
            }
        }
    }

    public double getPrecioTotalCarrito() {
        if (this.productos != null) {
            double total = 0.0;
            for (Producto p : this.productos) {
                total = total + (p.getPrecio() * p.getnUnidades());
            }
            return total;
        } else {
            return 0.0;
        }
    }
}
