package uniquindio.edu.co;

public class EnvioNacional extends Envio {

    private double costoKg;

    public EnvioNacional(int codigo, double peso, String destino,
                         Destinatario destinatario,
                         double costoKg) {
        super(codigo, peso, destino, destinatario);
        this.costoKg = costoKg;
    }
    public double calcularCostoEnvio(){
    return (costoKg + calcularCiudad(getDestino()));

    }

    public double getCostoKg() { return costoKg; }
    public void setCostoKg(double costoKg) { this.costoKg = costoKg; }
}