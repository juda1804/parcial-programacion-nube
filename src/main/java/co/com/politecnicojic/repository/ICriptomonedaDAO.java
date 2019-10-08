package co.com.politecnicojic.repository;

import co.com.politecnicojic.domain.Criptomoneda;

import java.util.List;

public interface ICriptomonedaDAO {
    Boolean deleteCriptomoneda(Criptomoneda criptomoneda);
    Boolean addCriptomoneda(Criptomoneda p);
    List<Criptomoneda> findCriptomonedaById(int id);
    Criptomoneda findCriptomonedaByIdAndDivisa(int id,String divisa);
    List<Criptomoneda> findCriptomonedas();

}
