package co.com.politecnicojic.service;

import co.com.politecnicojic.domain.Paleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.politecnicojic.repository.IPaletaDAO;

import java.util.List;

@Service
public class PaletaService implements IPaletaService {

    @Autowired
    private IPaletaDAO paletaDAO;

    @Override
    public List<Paleta> getPaletas() {
        return paletaDAO.getPaletas();
    }

    @Override
    public Paleta updatePaleta(Paleta p) {
        return paletaDAO.updatePaleta(p);
    }

    @Override
    public Boolean deletePaleta(Paleta paleta) {
        return paletaDAO.deletePaleta(paleta);
    }

    @Override
    public Boolean addPaleta(Paleta p) {
        return paletaDAO.addPaleta(p);
    }


}
