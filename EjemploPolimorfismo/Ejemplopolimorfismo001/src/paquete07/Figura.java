/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public abstract class Figura {
    protected String v;
    protected int area;

    public Figura(String caracteristicas, int area) {
        this.caracteristicas = caracteristicas;
        this.area = area;
    }
    
    
    public String setCaracteristicas(){
        return caracteristicas;
    }
    public int getCaracteristicas(){
        return caracteristicas;
    }
    public abstract void calcularArea();

    @Override
    public String toString() {
        return "Figura{" + "caracteristicas=" + caracteristicas + ", area=" + area + '}';
    }
    
    
            
}
