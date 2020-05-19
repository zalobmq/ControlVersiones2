
package poo1;


public class Persona {


     int edad;
     String nombre;
     int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarDatos(){
    
        System.out.println("Estos son los datos de persona");
        System.out.println("El nombre es :"+nombre);
        System.out.println("La edad es : "+edad);
        System.out.println("El telefono es : "+telefono);
        
    }

  

    
    
    

  

   
    
    
}
