package uni.fiis.bean;

/**
 * Created by Diego on 20/06/2015.
 */
public class Estacion {
    private String nombre;
    private Ubicacion ubicacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
