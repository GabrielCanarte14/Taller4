/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Strategy;

import Chain.Producto;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author User
 */
public interface ViewProductsStrategy {
    void loadViewProduct (Map<Producto,Integer > producto);
    boolean login (String user, String password);
}
