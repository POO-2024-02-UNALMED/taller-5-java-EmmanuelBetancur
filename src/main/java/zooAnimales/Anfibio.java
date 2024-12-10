package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre,int edad,String habitat,String genero, String colorPiel, Boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio(){
        super();
        listado.add(this);
    }

//creacion de metodos get
    public String getColorPiel() {
        return this.colorPiel;
    }

    public Boolean isVenenoso() {
        return this.venenoso;
    }

    //creacion de metodos set
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(Boolean venenoso){
        this.venenoso = venenoso;
    }

    //creacion de metodos cantidad anfibios, movimiento, crear rana y crear salamandra.

    public static int CantidadAnfibios(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }

}    