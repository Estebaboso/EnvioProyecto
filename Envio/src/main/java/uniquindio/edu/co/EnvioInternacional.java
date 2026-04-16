package uniquindio.edu.co;

public class EnvioInternacional extends Envio {

    private double costoKg;
    private double impuesto;

    public EnvioInternacional(int codigo, double peso, String destino,
                              Destinatario destinatario, TipoEnvio tipoEnvio,
                              double costoKg, double impuesto) {
        super(codigo, peso, destino, destinatario, tipoEnvio);
        this.costoKg = costoKg;
        this.impuesto = impuesto;
    }

    public double getCostoKg() { return costoKg; }
    public void setCostoKg(double costoKg) { this.costoKg = costoKg; }

    public double getImpuesto() { return impuesto; }
    public void setImpuesto(double impuesto) { this.impuesto = impuesto; }
}