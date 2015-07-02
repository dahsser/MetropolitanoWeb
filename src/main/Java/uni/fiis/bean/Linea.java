package uni.fiis.bean;

import java.util.List;

/**
 * Created by Diego on 20/06/2015.
 */
public class Linea {
    private List<Ubicacion> estaciones;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
