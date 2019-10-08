package co.com.politecnicojic.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Criptomoneda {


    @Getter
    @Setter
    private int idMoneda;

    @Getter
    @Setter
    private Long valor;


    @Getter
    @Setter
    private String simbolo;

    public Criptomoneda() {
    }

    public Criptomoneda(int idMoneda, Long valor, String simbolo) {
        this.idMoneda = idMoneda;
        this.valor = valor;
        this.simbolo = simbolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criptomoneda that = (Criptomoneda) o;
        return idMoneda == that.idMoneda &&
                simbolo == that.simbolo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMoneda, simbolo);
    }
}
