package estrella;

public class Estrella {
    String nombre;
    String tipo;
    Float edad;


    public Estrella(String nombre,String tipo, Float edad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        System.out.println("Estrella " +"Nombre: " + nombre  + ", Tipo: " + tipo + ", Edad: " + edad);
    }

    public String getNombre(){
        return "El nombre de la estrella es: " + nombre;
    }

    public String getTipo(){
        return "la estrella " + nombre + "es de tipo "+ tipo;
    }

    public String getEdad(){
        return "La edad de la estrella es: " + edad;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
        System.out.println("nombre actualizado a " + nombre );
    }

    public void setTipo(String nuevoTipo){
        tipo = nuevoTipo;
        System.out.println("Tipo de estrella actulizado a " + tipo);
    }

    public void setEdad(Float nuevaEdad){
        if(nuevaEdad  >= 0){
        edad = nuevaEdad;
        System.out.println("Edad actualizada a "+ edad);}
        else {
            System.out.println("la edad de la estrell debe ser mayor que 0");
        }
    }

}
