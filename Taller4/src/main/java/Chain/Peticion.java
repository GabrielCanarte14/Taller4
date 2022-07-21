/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author gabri
 */
public class Peticion {
    private Producto p;
    private boolean estado;
    
    public Peticion(Producto p){
        this.p = p;
        estado = true;
    }
    
    public void setP(Producto p) {
        this.p = p;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Producto getP() {
        return p;
    }

    public boolean isEstado() {
        return estado;
    }
    
    
}
