/*
 * Pruebe contacto crea dos nuevos objetos y los modifica y los imprime.
 */

/**
 *
 * @author Ruben de la Fuente Paredes 71877542N
 * 
 */
public class Prueba_contacto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Contacto contacto1=new Contacto("ruben", "fuente", "1111111");
        
         System.out.println("-------CONTACTO 1 ---------");
        System.out.println("Nombre: " + contacto1.getNombre());
        System.out.println("Apellidos: " +contacto1.getApellido());
        System.out.println("Telefono: " +contacto1.getTelefono());
        
        
        contacto1.setTelefono("000000");
        System.out.println("Nuevo telefono: "+ contacto1.getTelefono());
        
        
        System.out.println("-------CONTACTO 2 ---------");
        
        Contacto contacto2 =new Contacto("Juan", "Garcia", "2222222");
          
        System.out.println("Nombre: " + contacto2.getNombre());
        System.out.println("Apellido: " + contacto2.getApellido());
        System.out.println("Telefono: "+ contacto2.getTelefono());
        
        contacto2.setNombre("Pepe luis");
        System.out.println("Nombre modificado: " + contacto2.getNombre());
        
        
    }
    
}
