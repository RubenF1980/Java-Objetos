/*
 * Crear clase contacto con nombres apellidos y telefono  con su constructor y los 
 *metodos setter y getter .Hacer que el nombre salga en mayusculas y el telefono con +34 delante 
 */

/** 
 * @author Ruben de la Fuente Paredes 71877542N
 */
public class Contacto {
    
    private String nombre;
    private String apellido;
    private String telefono;
    
    
    
    public Contacto(String nombre,String apellido,String telefono){
    
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
    }    
    
  ///////setters modificar 
    public void setNombre(String nombre){
        
         this.nombre=nombre.toUpperCase();         

    }    
     public void setApellido(String apellido){
        
         this.apellido=apellido;     
    }    
     public void setTelefono(String telefono){
        
         this.telefono="+34-" + telefono;     
    }
     
     
     ///////getters mostrar  
     public String getNombre(){         
          
        return this.nombre;
     }
    
     public String getApellido(){         
           
        return this.apellido;
     }
     public String getTelefono(){         
           
        return this.telefono;
     }
    
}//class
