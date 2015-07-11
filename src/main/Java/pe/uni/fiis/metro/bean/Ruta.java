package pe.uni.fiis.metro.bean;

/**
 * Created by USUARIO on 30/06/2015.
 */
public class Ruta {
    private Linea linea;
    private Estacion estacionInicial;
    private Estacion estacionFinal;
    private Integer tiempo;

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public Estacion getEstacionInicial() {
        return estacionInicial;
    }

    public void setEstacionInicial(Estacion estacionInicial) {
        this.estacionInicial = estacionInicial;
    }

    public Estacion getEstacionFinal() {
        return estacionFinal;
    }

    public void setEstacionFinal(Estacion estacionFinal) {
        this.estacionFinal = estacionFinal;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
}
