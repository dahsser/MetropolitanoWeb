package pe.uni.fiis.metro.bean;

import java.util.List;

/**
 * Created by Diego on 20/06/2015.
 */
public class Linea{
    private List<Estacion> estaciones;
    private String nombre;
    private Integer idEstacion;
    private String sentido;

    public Integer getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(Integer idEstacion) {
        idEstacion = idEstacion;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}