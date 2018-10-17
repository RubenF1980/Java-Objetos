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
public class Mamifero extends Animal{
    
    private int nPatas;
    private boolean peludo;

    public Mamifero() {
    }

    public Mamifero(int nPatas, boolean peludo, String nombre, String especie) {
        super(nombre, especie);
        this.nPatas = nPatas;
        this.peludo = peludo;
    }

    
    
    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public boolean isPeludo() {
        return peludo;
    }

    public void setPeludo(boolean peludo) {
        this.peludo = peludo;
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de patas : " + this.getnPatas() + " Peludo: " + this.isPeludo() + "\n"; 
    }

    @Override
    public void hablar() {
        
        System.out.println("Muuuuuuuuuuuuuuuuuuu....");
    }
    
    
    
}
