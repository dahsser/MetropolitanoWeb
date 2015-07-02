package uni.fiis.dao;
import uni.fiis.bean.Estacion;
import uni.fiis.bean.Linea;
import java.util.List;
/**
 * Created by Diego on 20/06/2015.
 */
public interface LineaDAO {
    public List<Linea> ListarLineas(Estacion estacion, String nombre);

}
