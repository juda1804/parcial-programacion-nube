package co.com.politecnicojic.repository;

import co.com.politecnicojic.data.CriptomonedaData;
import co.com.politecnicojic.domain.Criptomoneda;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class CriptomonedaDAO implements ICriptomonedaDAO {

    @Override
    public Boolean deleteCriptomoneda(Criptomoneda criptomoneda) {
        return CriptomonedaData.getListaCriptomonedas().remove(criptomoneda);
    }

    @Override
    public Boolean addCriptomoneda(Criptomoneda p) {
        return CriptomonedaData.getListaCriptomonedas().add(p);
    }

    @Override
    public List<Criptomoneda> findCriptomonedaById(int id) {
        return io.vavr.collection.List
                .ofAll(CriptomonedaData.getListaCriptomonedas())
                .filter(criptomoneda -> criptomoneda.getIdMoneda() == id)
                .asJava();
    }

    @Override
    public Criptomoneda findCriptomonedaByIdAndDivisa(int id, String divisa) {
        return io.vavr.collection.List
                .ofAll(CriptomonedaData.getListaCriptomonedas())
                .filter(criptomoneda -> criptomoneda.getIdMoneda() == id && criptomoneda.getSimbolo().equals(divisa))
                .head();
    }

    @Override
    public List<Criptomoneda> findCriptomonedas() {
        return CriptomonedaData.getListaCriptomonedas();
    }
}
