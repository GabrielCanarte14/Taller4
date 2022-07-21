/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import java.util.HashMap;
import java.util.Map;
import Chain.*;
import java.util.LinkedList;
/**
 *
 * @author User
 */
public class StrategyAutomotriz implements RouteStrategy {
    
    private LinkedList<Producto> Productos;
    private Route origen;
    private Route destino;
    private boolean Viajando;
    @Override
    public void roadBuildStrategy(Route origin, Route destiny) {
        this.origen = origin;
        this.destino = destiny;
    }

    @Override
    public void run() {
        Viajando = true;
    }

    public void setProduct(Producto product) {
            this.Productos.add(product);
    }

    public StrategyAutomotriz() {
        this.Productos = new LinkedList<Producto>();
    }

    public LinkedList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(LinkedList<Producto> Productos) {
        this.Productos = Productos;
    }

    public Route getOrigen() {
        return origen;
    }

    public void setOrigen(Route origen) {
        this.origen = origen;
    }

    public Route getDestino() {
        return destino;
    }

    public void setDestino(Route destino) {
        this.destino = destino;
    }

    public boolean isViajando() {
        return Viajando;
    }

    public void setViajando(boolean Viajando) {
        this.Viajando = Viajando;
    }

   

    
}
