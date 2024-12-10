package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(String nombre,int edad,String habitat,String genero, Boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero(){
        super();
        listado.add(this);
    }

    //creacion de metodos get

    public Boolean getPelaje(){
        return this.pelaje;
    }

    public int getPatas(){
        return this.patas;
    }

    //creacion de metodos set

    public void setPelaje(Boolean pelaje){
        this.pelaje = pelaje;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }

    //creacion metodos cantidad mamiferos, crear caballo y crear leon

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public void crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
        this.caballos++;
    }

    public void crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
        this.leones++;
    }

}    