package uni.fiis.dao;
import uni.fiis.bean.Estacion;
import uni.fiis.bean.Ubicacion;
import java.util.List;
/**
 * Created by Diego on 20/06/2015.
 */
public interface EstacionDAO {
    public List<Estacion> ListarEstaciones(Ubicacion ubicacion, String nombre);
}
