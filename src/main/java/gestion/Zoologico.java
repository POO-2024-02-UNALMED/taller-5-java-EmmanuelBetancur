package gestion;
import java.util.ArrayList;

//Creacion de clase y sus atributos, constructores

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nom, String ubi){
        this.nombre = nom;
        this.ubicacion = ubi;
        this.zonas = new ArrayList<Zona>();
    }

    public Zoologico(){
        this.zonas = new ArrayList<Zona>();
    }

    //Creacion de metodos get

    public String getNombre(){
        return this.nombre;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return this.zonas;
    }

    //Creacion de metodos set
    
    public void setZona(ArrayList<Zona> zonas){
        this.zonas = zonas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    //creacion de metodos agregar zonas y cantidad total

    public void agregarZonas(Zona nzona){
        zonas.add(nzona);
    }

    public int cantidadTotalAnimales(){
        int nanimales = 0;
        for (Zona zona: zonas) {
            nanimales += zona.cantidadAnimales();
                }  return nanimales;
        }
    }