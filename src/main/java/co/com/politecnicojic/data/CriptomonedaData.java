package co.com.politecnicojic.data;

import co.com.politecnicojic.domain.Criptomoneda;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CriptomonedaData {
    @Setter
    @Getter
    private static List<Criptomoneda> listaCriptomonedas;

    static {
        listaCriptomonedas = new ArrayList<Criptomoneda>(){
            {
                add(new Criptomoneda(10,5000L,"USD"));
                add(new Criptomoneda(10,2000L,"EUR"));
                add(new Criptomoneda(11,7000L,"EUR"));
                add(new Criptomoneda(11,2000L,"USD"));
                add(new Criptomoneda(12,2000L,"EUR"));
            }
        };
    }
}
