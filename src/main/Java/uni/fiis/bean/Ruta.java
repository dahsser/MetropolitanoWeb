package uni.fiis.bean;

/**
 * Created by Diego on 20/06/2015.
 */
public class Ruta {
    private Ubicacion ubicacionInicial;
    private Ubicacion ubicacionFinal;
    private String nombre;

    public Ubicacion getUbicacionInicial() {
        return ubicacionInicial;
    }

    public void setUbicacionInicial(Ubicacion ubicacionInicial) {
        this.ubicacionInicial = ubicacionInicial;
    }

    public Ubicacion getUbicacionFinal() {
        return ubicacionFinal;
    }

    public void setUbicacionFinal(Ubicacion ubicacionFinal) {
        this.ubicacionFinal = ubicacionFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
