package co.com.politecnicojic.repository;

import co.com.politecnicojic.domain.Paleta;

import java.util.List;

public interface IPaletaDAO {
    List<Paleta> getPaletas();
    Paleta updatePaleta(Paleta p);
    Boolean deletePaleta(Paleta paleta);
    Boolean addPaleta(Paleta p);
}
