/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.intergrupo.main;

import net.intergrupo.arca.Animal;
import net.intergrupo.arca.Arca;
import net.intergrupo.arca.Mamifero;
import net.intergrupo.arca.Reptil;

/**
 *
 * @author Alumno37
 */
public class Main {
    
    public static void main(String[] args) {
       
        /*
        Animal animal;        
        animal=new Animal("Thor","perro");        
        System.out.println(animal);
        
        Reptil reptil;        
        reptil =new Reptil(true,15,"Bicho","iguana");        
        System.out.println(reptil);
        
        Mamifero mamifero;        
        mamifero=new Mamifero(4,false,"Superman","Gato");
        System.out.println(mamifero);
        
        ////creo clase animal y apunta a un objeto mamifero
        Animal animalAux;
        animalAux=new Mamifero(4,true,"Omar","Pajaro");
        System.out.println(animalAux);
       
        //Esto no se puede hacer 
        ///animalAux.setnPatas(4);        
        // Mamifero mamiferoAux;
         // mamiferoAux=new Animal(()"Luis","Humano");
       
       */
        
        Arca arca =new Arca(); //nueva arca 
        
        Mamifero mamifero1=new Mamifero(2,true,"Luis","Humano");
        Mamifero mamifero2=new Mamifero(4,true,"Felix","Gato");
        
        Reptil reptil1=new Reptil(false,4,"Bicho","Iguana");
        Reptil reptil2=new Reptil(true,5,"Serpiente","Cobra");
        
        arca.insertarAnimal(mamifero1);
        arca.insertarAnimal(reptil1);
        arca.insertarAnimal(mamifero2);
        arca.insertarAnimal(reptil2);
        arca.hablarArca();
        
        
    }
}
