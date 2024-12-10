package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre,int edad,String habitat,String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(){
        super();
        listado.add(this);
    }

    //creacion de metodos get

    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public int getCantidadAletas(){
        return this.cantidadAletas;
    }

    //creacion de metodos set

    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public void setCantidadAletas (int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }
    
    //creacion de metodos cantidadpeces, movimiento, crearbacalao y crear salmon.

    public static int cantidadPeces(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        salmones++;
        return new Pez(nombre,edad,"oceano",genero,"rojo",6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        bacalaos++;
        return new Pez(nombre,edad,"oceano",genero,"gris",6);
    }

}    