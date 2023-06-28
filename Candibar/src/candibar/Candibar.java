/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candibar;

/**
 *
 * @author Lino Fernando Villca Jaita
 */
public class Candibar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoSimple pipocapequena = new ProductoSimple("Pipoca Pequeña", 5);
        ProductoSimple pipocamediana = new ProductoSimple("Pipoca Mediana", 8);
        ProductoSimple pipocagrande = new ProductoSimple("Pipoca Grande", 10);

        ProductoSimple sodapequena = new ProductoSimple("Soda Pequeña", 4);
        ProductoSimple sodaamediana = new ProductoSimple("Soda Mediana", 6);
        ProductoSimple sodagrande = new ProductoSimple("Soda Grande", 8);

//combo 1
        ProductoCompuesto combo1 = new ProductoCompuesto("Combo 1: (2 pipocas medianas + 2 sodas medianas)");
        combo1.addProducto(pipocamediana);
        combo1.addProducto(pipocamediana);
        combo1.addProducto(sodaamediana);
        combo1.addProducto(sodaamediana);

//combo 2
        ProductoCompuesto combo2 = new ProductoCompuesto("Combo 2: (1 Pipoca Mediana + Soda Mediana)");
        combo2.addProducto(pipocamediana);
        combo2.addProducto(sodaamediana);
        
        
//combo 3
        ProductoCompuesto combo3 = new ProductoCompuesto("Combo 3: (2 pipocas grandes + 2 sodas medianas)");
        combo3.addProducto(pipocagrande);
        combo3.addProducto(pipocagrande);
        combo3.addProducto(sodaamediana);
        combo3.addProducto(sodaamediana);

        Venta pipocas = new Venta(1, "Juan Ramirez");
        pipocas.addProducto(pipocagrande);
        pipocas.addProducto(sodagrande);
        pipocas.imprimirVenta();
        
        Venta sodas = new Venta(2, "Luis Esteban");
        sodas.addProducto(sodapequena);
        sodas.imprimirVenta();
        

        Venta comboUno = new Venta(3, "Marcos Guerra");
        comboUno.addProducto(combo1);
        comboUno.imprimirVenta();
        
        Venta comboDos = new Venta(4, "Rene Paz");
        comboDos.addProducto(combo2);
        comboDos.imprimirVenta();
        
        Venta comboTres = new Venta(5, "Javier Fernandez");
        comboTres.addProducto(combo3);
        comboTres.imprimirVenta();
        
        Venta comboCuatro = new Venta(6, "Jose Encinas");
        comboCuatro.addProducto(combo3);
        comboCuatro.addProducto(pipocapequena);
        comboCuatro.addProducto(sodapequena);
        comboCuatro.imprimirVenta();


        
    
    }
}
    
