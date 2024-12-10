import estrella.Estrella;
import estrella.*;
import planeta.Planeta;
import satelite.Satelite;

public class Main {
    public static void main(String[] args) {

        //Informacion Estudiante
        System.out.println("Andres David Cantillo Castro #Codigo estudiantil: 7502410003");
        System.out.println("**************************************************************");


        //Instanciando clase estrella con metodo constructor personalizado
        Estrella estrella1 = new Estrella("Strella 122", "Supernova", 21f);

        //Probando metodos Getters Estrella
        System.out.println(estrella1.getNombre());
        System.out.println(estrella1.getTipo());
        System.out.println(estrella1.getEdad());

        //Metodos Setters estrella
        estrella1.setNombre("Alpha Tauri");
        estrella1.setEdad(200f);
        estrella1.setTipo("Gigante Blanca");

        System.out.println("***************************************************************");
        //Instanciando clase Planeta con el constructor por defecto
        Planeta planeta1 = new Planeta();

        //Definiendo propiedades de el objeto con los Setters
        planeta1.setEdad(300f);
        planeta1.setNombre("Marte");
        planeta1.setMasa(133f);

        //Obteniendo los datos de el obejeto con los Getters
        System.out.println(planeta1.getNombre());
        System.out.println(planeta1.getMasa());
        System.out.println(planeta1.getDistanciaSol());



        System.out.println("***************************************************************");
        //Instanciando la clase satelite
        Satelite satelite1 = new Satelite("Luna",12f ,"elipse de baja excentricidad" );

        //Obteniendo datos de el objeto satelite
        System.out.println(satelite1.getNombre());
        System.out.println(satelite1.getOrbita());
        System.out.println(satelite1.getTamano());


        //Cambiando las propiedades del objeto con los setters
        satelite1.setNombre("Tritan");
        satelite1.setOrbita("Orbita Geoestacionaria");
        satelite1.setTamano(30f);

    }
}