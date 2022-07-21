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
    private Map <Producto,Integer> producto;
    //private LinkedList<Producto> Productos;
    private Route origen;
    private Route destino;
    private boolean Viajando;
    int capacity;
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
            this.producto.get(product);
    }

    public StrategyAutomotriz() {
        this.producto = new HashMap<Producto,Integer>();
    }

    public Map<Producto,Integer> getProductos() {
        return producto;
    }

    public void setProductos(Map<Producto,Integer> Productos) {
        this.producto = Productos;
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

    public Map<Producto, Integer> getProducto() {
        return producto;
    }

    public void setProducto(Map<Producto, Integer> producto) {
        this.producto = producto;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   

    
}
