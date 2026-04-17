package uniquindio.edu.co;

public class Destinatario {
    private String nombre;
    private String documento;
    private String telefono;
    private String ciudad;

    public Envio theEnvioDestinatario;
    public Empresa theEmpresaDestinatario;

    public Destinatario(nombre, documento, telefono, ciudad){
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.ciudad = ciudad;
   }

   public InformeDestinatario generarInformeDestinatario(){
        return new InformeDestinatario (nombre, documento, telefono, ciudad);
   }
}
