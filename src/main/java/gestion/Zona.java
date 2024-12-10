package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

//Defiicion de clase y sus atributos
public class Zona{
    private String nombre;
    private gestion.Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nom, gestion.Zoologico zooZona){
        this.nombre = nom;
        this.zoo = zooZona;
        this.animales =  new ArrayList<Animal>();
    }

    public Zona(){
        this.animales = new ArrayList<Animal>();
    }

//Creacion de metodos get

    public gestion.Zoologico getZoo(){
        return zoo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }

//Creacion de metodos set

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setZoo(gestion.Zoologico zoo){
        this.zoo = zoo;
    }

    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }

//Creacion de metodo agregar animales


    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

//Creacion de metodo Cantidad animales

    public int cantidadAnimales(){
        return animales.size();
    }

}