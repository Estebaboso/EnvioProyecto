package uniquindio.edu.co;

public class EnvioNacional extends Envio {

    private double costoKg;

    public EnvioNacional(int codigo, double peso, String destino,
                         Destinatario destinatario, TipoEnvio tipoEnvio,
                         double costoKg) {
        super(codigo, peso, destino, destinatario, tipoEnvio);
        this.costoKg = costoKg;
    }

    public double getCostoKg() { return costoKg; }
    public void setCostoKg(double costoKg) { this.costoKg = costoKg; }
}