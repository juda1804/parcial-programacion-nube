package co.com.politecnicojic.service;

import co.com.politecnicojic.domain.Paleta;

import java.util.List;

public interface IPaletaService {
    List<Paleta> getPaletas();
    Paleta updatePaleta(Paleta p);
    Boolean deletePaleta(Paleta paleta);
    Boolean addPaleta(Paleta p);

}
