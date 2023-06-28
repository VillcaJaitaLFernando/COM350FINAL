/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candibar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductoCompuesto extends ProductoAbstracto{
    private List< ProductoAbstracto > productos = new ArrayList< ProductoAbstracto>();
    
    public ProductoCompuesto(String nombre) {
        super(nombre, 0);
    
    }
    
    @Override
    public double getPrecio() {
        double precio = 0d;
        for (ProductoAbstracto hijo : productos) {
            precio += hijo.getPrecio();
        }
        return precio;
    }

    @Override
    public void setPrecio(double price) {
        double precio = 0d;
        this.precio=getPrecio();
        
    }

    public void addProducto(ProductoAbstracto producto) {
        this.productos.add(producto);
    }

    public boolean removeProduct(ProductoAbstracto producto) {
        return this.productos.remove(producto);
    }
}
