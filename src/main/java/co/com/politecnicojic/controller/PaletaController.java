package co.com.politecnicojic.controller;


import co.com.politecnicojic.domain.Paleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.com.politecnicojic.service.IPaletaService;

import java.util.List;

@RestController
public class PaletaController {

    @Autowired
    IPaletaService paletaService;

    @GetMapping("/paletas")
    public List<Paleta> getPaletas() {
        return paletaService.getPaletas();
    }

    @PostMapping("/paleta")
    public  Boolean addPaleta(@RequestBody Paleta paleta) {
        return paletaService.addPaleta(paleta);
    }


    @PutMapping("/paleta")
    public  Paleta updatePaleta(@RequestBody Paleta paleta) {
        return paletaService.updatePaleta(paleta);
    }


    @DeleteMapping("/paleta")
    public  Boolean deletePaleta(@RequestBody Paleta paleta) {
        return paletaService.deletePaleta(paleta);
    }


}
