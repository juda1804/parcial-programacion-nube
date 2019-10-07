package co.com.politecnicojic.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Paleta {


    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String color;


    @Getter
    @Setter
    private String sabor;


    @Getter
    @Setter
    private String precio;


    @Getter
    @Setter
    private Proveedor proveedor;

    public Paleta() {
    }

    public Paleta(int id, String color, String sabor, String precio, Proveedor proveedor) {
        this.id = id;
        this.color = color;
        this.sabor = sabor;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paleta paleta = (Paleta) o;
        return Objects.equals(id, paleta.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
