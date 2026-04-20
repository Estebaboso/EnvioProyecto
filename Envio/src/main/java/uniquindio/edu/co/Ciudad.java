package uniquindio.edu.co;

public class Ciudad {
    private String nombre;
    private String codPostal;
    private String pais;

    public Envio theCiudadEnvioOrigen;
    public Envio getTheCiudadEnvioDestino;

    public Ciudad(String nombre, String codPostal, String pais){
        this.nombre = nombre;
        this.codPostal = codPostal;
        this.pais = pais;
    }
}
