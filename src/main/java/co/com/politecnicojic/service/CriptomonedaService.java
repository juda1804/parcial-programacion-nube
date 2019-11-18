package co.com.politecnicojic.service;

import co.com.politecnicojic.domain.Criptomoneda;
import io.vavr.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.politecnicojic.repository.ICriptomonedaDAO;

import java.util.List;

@Service
public class CriptomonedaService implements ICriptomonedaService {

    @Autowired
    private ICriptomonedaDAO criptomonedaDAO;


    @Override
    public Boolean deleteCriptomoneda(int id, String divisa) {
        Criptomoneda criptomoneda = criptomonedaDAO.findCriptomonedaByIdAndDivisa(id,divisa);
        return criptomonedaDAO.deleteCriptomoneda(criptomoneda);
    }

    @Override
    public Boolean addCriptomoneda(Criptomoneda p) {
        List<Criptomoneda> filter = criptomonedaDAO.findCriptomonedaById(p.getIdMoneda());
        if (validate(filter,p)) {
            return criptomonedaDAO.addCriptomoneda(p);
        } else {
            return false;
        }
    }

    @Override
    public List<Criptomoneda> getCriptomonedas() {
        return criptomonedaDAO.findCriptomonedas();
    }

    @Override
    public Criptomoneda findMaxDivisa() {
        return io.vavr.collection.List
                .ofAll(criptomonedaDAO.findCriptomonedas())
                .sortBy(Criptomoneda::getValor)
                .reverse()
                .head();
    }

    @Override
    public String findMaxUsedDivisa() {
        io.vavr.collection.List<Criptomoneda> criptomonedas = io.vavr.collection.List.
                ofAll(criptomonedaDAO.findCriptomonedas());

        return criptomonedas
                .map(Criptomoneda::getSimbolo)
                .distinct()
                .map(
                        divisa -> {
                            int number = criptomonedas.filter(it -> it.getSimbolo().equals(divisa)).length();
                            return Tuple.of(divisa,number);
                        }
                ).sortBy( it -> it._2)
                .reverse()
                .headOption()
                .map( it -> it._1)
                .getOrElse("No hay nada");
    }

    private Boolean validate(List<Criptomoneda> criptomonedas, Criptomoneda criptomoneda){
        return io.vavr.collection.List.ofAll(criptomonedas)
            .filter(cripto -> cripto.getSimbolo().equals(criptomoneda.getSimbolo()))
            .isEmpty();
    }

}
