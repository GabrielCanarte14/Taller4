/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author gabri
 */
public interface ComprobacionProducto {
    public void realizarComprobacion(Peticion peticion, Comprobacion c);
    public void setNext(Comprobacion c);
}
