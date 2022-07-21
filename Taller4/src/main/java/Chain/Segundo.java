/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain;

/**
 *
 * @author gabri
 */
public class Segundo extends Comprobacion {
    public String mensaje;

    public Segundo(String mensaje) {
        this.mensaje = mensaje;
    }


    @Override
    public void setNext(Comprobacion c) {
        super.siguiente = c;
    }

    @Override
    public void realizarComprobacion(Peticion peticion, Comprobacion c) {
                if (peticion.isEstado() == true){
                    System.out.println(mensaje);
                    setNext(c);
                    
        }
    }
}
