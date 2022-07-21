/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author gabri
 */
public class Producto {
    
    public boolean garantia;
    public int precio;
    public String id;
    public String nombre;
    
    public Producto(int precio, String id, String nombre){
        this.precio = precio;
        this.id = id;
        this.nombre = nombre;
        garantia = true;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public int getPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
