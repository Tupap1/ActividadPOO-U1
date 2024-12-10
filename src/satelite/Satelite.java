package satelite;

public class Satelite {
    String nombre;
    Float tamano;
    String orbita;


    //constructor con parametros
    public Satelite(String nombre, Float tamano, String orbita){
        this.nombre = nombre;
        this.tamano = tamano;
        this.orbita = orbita;

    }

    public String getNombre(){
        return nombre;
    }

    public String getOrbita(){
        return orbita;
    }

    public Float getTamano(){
        return tamano;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
        System.out.println("nombre actualizado a " + nombre );
    }

    public void setOrbita(String nuevaOrbita){
        orbita = nuevaOrbita;
        System.out.println("Tipo de orbita actuzalizada a " + orbita);
    }

    public void setTamano(Float nuevoTamano){
        if(nuevoTamano  >= 0){

        tamano = nuevoTamano;
        System.out.println("Tamaño satelite acutalizado a "+ tamano);}
        else {
            System.out.println("el tamano del satelite no puede ser menor que 0");
        }
    }


}
