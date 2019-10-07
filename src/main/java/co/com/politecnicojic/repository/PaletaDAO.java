package co.com.politecnicojic.repository;

import co.com.politecnicojic.data.PaletaData;
import co.com.politecnicojic.domain.Paleta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaletaDAO implements IPaletaDAO{


    @Override
    public List<Paleta> getPaletas() {
        return PaletaData.getListaPaletas();
    }

    @Override
    public Paleta updatePaleta(Paleta p) {
        int index = PaletaData.getListaPaletas().indexOf(p);
        return PaletaData.getListaPaletas().set(index,p);
    }

    @Override
    public Boolean deletePaleta(Paleta paleta) {
        return PaletaData.getListaPaletas().remove(paleta);
    }

    @Override
    public Boolean addPaleta(Paleta p) {
        return PaletaData.getListaPaletas().add(p);
    }
}
