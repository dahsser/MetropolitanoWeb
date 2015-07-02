package uni.fiis.dao;
import uni.fiis.bean.Ubicacion;
import java.util.List;
/**
 * Created by Diego on 20/06/2015.
 */
public interface UbicacionDAO {
    public List<Ubicacion> ListarUbicacion(Ubicacion origen, Ubicacion destino);
}
