/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import domainmodel.Producto;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Angelo
 */
@Remote
public interface ICarritosRemote {

    public void usarCarrito(String id);

    public void anadirProductoCarrito(String id, Producto p);

    public double getPrecioProducto(String id);

    public List<Producto> getProductos(String id);

    public double getPrecioTotalCarrito(String id);

    public void remove(String id);

    public void remove();
}
