/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Strategy;
import Chain.Producto;
/**
 *
 * @author User
 */
public interface RouteStrategy {
    void roadBuildStrategy (Route origin, Route destiny);
    void setProduct (Producto product);
    void run ();
          
}
