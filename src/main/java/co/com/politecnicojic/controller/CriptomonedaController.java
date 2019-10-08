package co.com.politecnicojic.controller;


import co.com.politecnicojic.domain.Criptomoneda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.com.politecnicojic.service.ICriptomonedaService;

import java.util.List;

@RestController
public class CriptomonedaController {

    @Autowired
    ICriptomonedaService criptomonedaService;

    @GetMapping("/criptomonedas")
    public List<Criptomoneda> getCriptomonedas(){
        return criptomonedaService.getCriptomonedas();
    }

    @PostMapping("/criptomoneda")
    public  Boolean addCriptomoneda(@RequestBody Criptomoneda criptomoneda) {
        return criptomonedaService.addCriptomoneda(criptomoneda);
    }

    @DeleteMapping("/criptomoneda/{id}/{divisa}")
    public  Boolean deleteCriptomoneda(@PathVariable int id, @PathVariable String divisa) {
        return criptomonedaService.deleteCriptomoneda(id, divisa);
    }

    @GetMapping("/criptomoneda/mayor-divisa")
    public Criptomoneda findCriptomonedaWithMaxDivisa(){
        return criptomonedaService.findMaxDivisa();
    }

    @GetMapping("/max-used-divisa")
    public String findMaxUsedDivisa() {
        return criptomonedaService.findMaxUsedDivisa();
    }



}
