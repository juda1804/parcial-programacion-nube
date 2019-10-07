package co.com.politecnicojic.data;

import co.com.politecnicojic.domain.Paleta;
import co.com.politecnicojic.domain.Proveedor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class PaletaData {
    @Setter
    @Getter
    private static List<Paleta> listaPaletas;

    static {
        listaPaletas = new ArrayList<Paleta>(){
            {
                add(new Paleta(
                        1,
                        "blanco",
                        "rico",
                        "2321",
                        new Proveedor("Luis","Colombiano")
                ));
            }
        };
    }
}
