package uniquindio.edu.co;

public class EnvioNacional extends Envio {

    private double costoKg;

    public EnvioNacional(int codigo, double peso, String destino,
                         Destinatario destinatario, TipoEnvio tipoEnvio,
                         double costoKg) {
        //aqui da error el EstadoEnvio el cual es el enum que toma la clase Envio
        //Por cierto ya tiene get y set
        super(codigo, peso, destino, destinatario, tipoEnvio, EstadoEnvio);
        this.costoKg = costoKg;
    }

    public double getCostoKg() { return costoKg; }
    public void setCostoKg(double costoKg) { this.costoKg = costoKg; }
}