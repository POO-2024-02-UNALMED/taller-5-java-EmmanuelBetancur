package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

//Defiicion de clase y sus atributos
public class Zona{
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;

    public Zona(String nom, Zoologico zooZona){
        this.nombre = nom;
        this.zoo = zooZona;
        this.animales =  new ArrayList<Animal>();
    }

    public Zona(){
        this.nombre = null;
        this.zoo = null;
        this.animales = new ArrayList<Animal>();
    }

//Creacion de metodos get

    public Zoologico getZoo(){
        return this.zoo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList getAnimales(){
        return this.animales;
    }

//Creacion de metodos set

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }

//Creacion de metodo agregar animales


    public void agregarAnimales(String nombre, int edad, String habitat, String genero){
        Animal nanimal = new Animal(nombre, edad, habitat, genero, this);
        animales.add(nanimal);
    }

//Creacion de metodo Cantidad animales

    public int cantidadAnimales(){
        return animales.size();
    }

}