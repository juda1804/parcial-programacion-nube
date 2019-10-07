package co.com.politecnicojic.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Proveedor {

    @Getter
    @Setter
    private String nombre;


    @Getter
    @Setter
    private String nacionalidad;

    public Proveedor() {

    }

    public Proveedor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(nombre, proveedor.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
