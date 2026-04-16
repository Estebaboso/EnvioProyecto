package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String nit;
    private List<Envio> listaEnvios;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaEnvios = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public List<Envio> getListaEnvios() { return listaEnvios; }
    public void setListaEnvios(List<Envio> listaEnvios) { this.listaEnvios = listaEnvios; }
}