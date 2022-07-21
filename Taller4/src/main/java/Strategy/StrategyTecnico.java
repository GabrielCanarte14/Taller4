/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Chain.Producto;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author User
 */
public class StrategyTecnico implements ViewProductsStrategy {
    private String Name;
    private String code;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void loadViewProduct(Map<Producto,Integer > producto) {
        System.out.println ("Cargar vista para Técnico");    }

    @Override
    public boolean login(String user, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
