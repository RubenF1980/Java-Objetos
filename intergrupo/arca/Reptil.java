/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.intergrupo.arca;

/**
 *
 * @author Alumno37
 */
public class Reptil extends Animal{
    
    private boolean venenoso;
    private int longitud;

    public Reptil() {
    }

    public Reptil(boolean venenoso, int longitud, String nombre, String especie) {
        super(nombre, especie);
        this.venenoso = venenoso;
        this.longitud = longitud;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return super.toString() + " Venenoso: "+ this.isVenenoso()+" Longitud: " + this.getLongitud()+ "\n"; 
    }

    @Override
    public void hablar() {        
        System.out.println("Zzzzzzzzzzzzzzzzzzzz.....");
                
    }
    
    
    
}
