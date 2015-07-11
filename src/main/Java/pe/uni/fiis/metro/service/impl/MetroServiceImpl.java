package pe.uni.fiis.metro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.uni.fiis.metro.bean.Ruta;
import pe.uni.fiis.metro.bean.Ubicacion;
import pe.uni.fiis.metro.dao.RutaDAO;
import pe.uni.fiis.metro.service.MetroService;

import java.util.List;

/**
 * Created by Diego on 02/07/2015.
 */
@Service
@Transactional
public class MetroServiceImpl implements MetroService {
    @Autowired
    private RutaDAO rutaDAO;

    public void setRutaDAO(RutaDAO rutaDAO) {
        this.rutaDAO = rutaDAO;
    }

    public List<Ruta> listarRutas(Ubicacion origen, Ubicacion destino) {
        return rutaDAO.listarRutas(origen,destino);
    }
}
