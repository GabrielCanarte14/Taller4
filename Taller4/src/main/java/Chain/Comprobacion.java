/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author gabri
 */
public abstract class Comprobacion implements ComprobacionProducto{

    public Comprobacion siguiente;
    

    @Override
    public abstract void realizarComprobacion(Peticion peticion, Comprobacion c);
       

    @Override
    public abstract void setNext(Comprobacion c);
 
        

    
}
