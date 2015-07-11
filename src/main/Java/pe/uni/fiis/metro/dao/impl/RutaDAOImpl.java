package pe.uni.fiis.metro.dao.impl;

import com.sun.scenario.effect.impl.prism.PrImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.uni.fiis.metro.bean.Ruta;
import pe.uni.fiis.metro.bean.Ubicacion;
import pe.uni.fiis.metro.dao.RutaDAO;
import pe.uni.fiis.metro.dao.mapper.RutaMapper;

import java.util.List;

/**
 * Created by Diego on 02/07/2015.
 */
@Repository
public class RutaDAOImpl implements RutaDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Ruta> listarRutas(Ubicacion origen, Ubicacion destino) {
        String sql="SELECT A.nombre,O.nombre Origen,D.nombre Destino\n" +
                "FROM (SELECT *\n" +
                "      FROM  Linea\n" +
                "      WHERE Id_Estacion in (SELECT Id_Estacion\n" +
                "                            FROM  Estaciones\n" +
                "                            WHERE 12756274*ATAN2(sqrt(POWER(SIN(("+origen.getLatitud()+"-latitud)*3.1415/360),2)+(COS("+origen.getLatitud()+"*3.1415/180))*(COS(latitud*3.1415/180))*\n" +
                "                            (POWER(SIN(("+origen.getLongitud()+"-longitud))*3.1415/360,2))),\n" +
                "                            sqrt(1-POWER(SIN(("+origen.getLatitud()+"-latitud)*3.1415/360),2)+(COS("+origen.getLatitud()+"*3.1415/180))*\n" +
                "                            (COS(latitud*3.1415/180))*(POWER(SIN(("+origen.getLongitud()+"-longitud)*3.1415/360),2))))<800)) A\n" +
                "INNER JOIN (SELECT *\n" +
                "            FROM  Linea\n" +
                "            WHERE Id_Estacion in(SELECT Id_Estacion\n" +
                "                                FROM  Estaciones\n" +
                "                               WHERE 12756274*ATAN2(sqrt(POWER(SIN(("+destino.getLatitud()+"-latitud)*3.1415/360),2)+(COS("+destino.getLatitud()+"*3.1415/180))*(COS(latitud*3.1415/180))*\n"+
                "                            (POWER(SIN(("+destino.getLongitud()+"-longitud))*3.1415/360,2))),\n" +
                "                            sqrt(1-POWER(SIN(("+destino.getLatitud()+"-latitud)*3.1415/360),2)+(COS("+destino.getLatitud()+"*3.1415/180))*\n" +
                "                            (COS(latitud*3.1415/180))*(POWER(SIN(("+destino.getLongitud()+"-longitud)*3.1415/360),2))))<800)) B\n" +
                "ON (A.nombre=B.nombre) " +
                "inner join Estaciones O\n" +
                "on(A.Id_Estacion= O.Id_Estacion)\n" +
                "inner join Estaciones D\n" +
                "on(B.Id_Estacion= D.Id_Estacion)";
        return jdbcTemplate.query(sql,new RutaMapper());

    }
}
