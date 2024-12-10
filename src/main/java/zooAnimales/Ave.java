package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre,int edad,String habitat,String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(){
        super();
        listado.add(this);
    }

    //creacion de metodo get

    public String getColorPlumas(){
        return this.colorPlumas;
    }

    //creacion de metodo set

    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    //creacion de metodos cantidadaves, crear halcon, crear aguila y movimiento

    public static int cantidadAves(){
        return listado.size();
    }

    public void crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave(nombre,edad,"montañas",genero,"cafe glorioso");
        this.halcones++;
    }

    public void crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
        this.aguilas++;
    }

    @Override
    public String movimiento(){
        return "volar";
    }

}    