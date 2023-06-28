/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candibar;

/**
 *
 * @author LENOVO
 */
public abstract class ProductoAbstracto {
    protected String nombre;
    protected double precio;

    public ProductoAbstracto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
