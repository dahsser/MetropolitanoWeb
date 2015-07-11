package pe.uni.fiis.metro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pe.uni.fiis.metro.bean.Ruta;
import pe.uni.fiis.metro.bean.Ubicacion;
import pe.uni.fiis.metro.service.MetroService;

import java.util.List;

/**
 * Created by Diego on 02/07/2015.
 */
@Controller
public class MetroController {
    @Autowired
    private MetroService metroService;

    public void setMetroService(MetroService metroService) {
        this.metroService = metroService;
    }

    @RequestMapping (value="/ver-rutas",method = RequestMethod.GET )
    public String metodo(ModelMap model){
         return "inicio";
    }
    @RequestMapping (value="/rutas",method = RequestMethod.GET )
    public String metodo1(@RequestParam(value="latitud1")  Double latitud1,
                          @RequestParam(value="longitud1")  Double longitud1,
                          @RequestParam(value="latitud2")  Double latitud2,
                          @RequestParam(value="longitud2")  Double longitud2,
                          ModelMap model){
        Ubicacion origen=new Ubicacion();
        origen.setLatitud(latitud1);
        origen.setLongitud(longitud1);
        Ubicacion destino=new Ubicacion();
        destino.setLatitud(latitud2);
        destino.setLongitud(longitud2);
        List<Ruta> lista= metroService.listarRutas(origen,destino);
        model.addAttribute("rutas",lista);
        return "inicio";
    }
}
