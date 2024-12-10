package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String Ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nom, String ubi){
        this.nombre = nom;
        this.ubicacion = ubi;
        this.zonas = new ArrayList<Zona>();
    } 

    public void agregarZonas(String nombre){
        Zona nzona =  new Zona(nombre)
        nzona.zoo = this
    }

    public int cantidadTotalAnimales(){
        nanimales = 0;
        for (int i = 0; i < zonas.length; i = i+1) {
            for (int j = 0; j < animales.length; j = j+1) {
                if(animales[j] != null){
                    nanimales++;
                }
            }
        } return nanimales;
    }

}