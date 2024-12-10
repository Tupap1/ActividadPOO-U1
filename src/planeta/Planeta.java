package planeta;

import java.util.Objects;

public class Planeta {

    String nombre;
    Float masa;
    Float distanciaSol;





    public String getNombre(){
        return "El nombre del planeta es: "+ nombre;
    }

    public String getMasa(){
        return "La masa del planeta es: " +masa;
    }

    public String getDistanciaSol(){
        return "La distancia del planeta al sol es: " + distanciaSol;
    }

    public void setNombre(String nuevoNombre){
        if(Objects.equals(nuevoNombre, "")){
            System.out.println("ingresa un nombre valido");
        } else{
        nombre = nuevoNombre;
        System.out.println("nombre actualizado a " + nombre );}
    }

    public void setMasa(Float nuevaMasa){
        if (nuevaMasa  >= 0){
        masa = nuevaMasa;
        System.out.println("cantidad de masa actulizada a " + masa);}
        else{
            System.out.println("La masa debe ser mayor que 0");
        }
    }

    public void setEdad(Float nuevaDistanciaSol){
        distanciaSol = nuevaDistanciaSol;
        System.out.println("Distancia del planeta del sol actualizada a "+ distanciaSol);
    }

}
