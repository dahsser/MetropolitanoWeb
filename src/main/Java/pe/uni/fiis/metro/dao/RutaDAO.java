package pe.uni.fiis.metro.dao;

import pe.uni.fiis.metro.bean.Ruta;
import pe.uni.fiis.metro.bean.Ubicacion;

import java.util.List;

/**
 * Created by Diego on 02/07/2015.
 */
public interface RutaDAO {
    public List<Ruta> listarRutas(Ubicacion origen,Ubicacion destino);
}
