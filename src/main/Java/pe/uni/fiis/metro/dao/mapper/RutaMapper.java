package pe.uni.fiis.metro.dao.mapper;


import org.springframework.jdbc.core.RowMapper;
import pe.uni.fiis.metro.bean.Estacion;
import pe.uni.fiis.metro.bean.Linea;
import pe.uni.fiis.metro.bean.Ruta;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Diego on 02/07/2015.
 */
public class RutaMapper implements RowMapper<Ruta> {
    public Ruta mapRow(ResultSet resultSet, int i) throws SQLException {
        Ruta ruta=new Ruta();
        ruta.setLinea(new Linea());
        ruta.getLinea().setNombre(resultSet.getString("nombre"));
        ruta.setEstacionFinal(new Estacion());
        ruta.getEstacionFinal().setNombre(resultSet.getString("Destino"));
        ruta.setEstacionInicial(new Estacion());
        ruta.getEstacionInicial().setNombre(resultSet.getString("Origen"));

        return ruta;
    }
}
