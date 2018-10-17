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
public class Arca {
    
    private Animal[] arca;
    private int posicion;
    
    public Arca() {
        
        this.arca=new Animal[4];
        this.posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public boolean estaLlenaArca(){
        //retorna true cuando esta llena cuando la posi es igual a la longitud del arca 
        return this.getPosicion()==this.arca.length;
        
    }
    
    public boolean insertarAnimal(Animal animal){
        
        boolean insertado=true;
        
        if(!this.estaLlenaArca()){
            this.arca[this.getPosicion()]=animal;// inserto animal en la posicion libre 
            this.setPosicion(this.getPosicion()+1);//incremento la posicion 
        
        
        }else insertado=false;
        
        return insertado;
    
    }
    
    public void hablarArca(){
        
        for(Animal animal : this.arca){ //coje todos los animales del arca y les hace hablar
            animal.hablar();        
         }
    }
    
    
    
}
