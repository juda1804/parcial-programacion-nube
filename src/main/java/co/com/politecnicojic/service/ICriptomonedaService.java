package co.com.politecnicojic.service;

import co.com.politecnicojic.domain.Criptomoneda;

import java.util.List;

public interface ICriptomonedaService {
    Boolean deleteCriptomoneda(int id, String divisa);
    Boolean addCriptomoneda(Criptomoneda p);
    List<Criptomoneda> getCriptomonedas();
    Criptomoneda findMaxDivisa();
    String findMaxUsedDivisa();

}
