/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candibar;

/**
 *
 * @author LENOVO
 */
public class ProductoSimple extends ProductoAbstracto{
    public ProductoSimple(String nombre, double precio) {
        super(nombre, precio);
    }
@Override
    public double getPrecio() {
        return this.precio;
    }
}
