package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Destinatario {
    private String nombre;
    private String documento;
    private String telefono;
    private String ciudad;

    public Envio theEnvioDestinatario;
    public Empresa theEmpresaDestinatario;
    public List<Envio> listClienteDestinatario;
    public List<Envio> listCienteRemitente;

    public Destinatario(String nombre,String documento,String telefono,String ciudad){
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.listClienteDestinatario = new ArrayList<>();
        this.listCienteRemitente = new ArrayList<>();
   }

   public InformeDestinatario generarInformeDestinatario(){
        return new InformeDestinatario (nombre, documento, telefono, ciudad);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Envio> getListCienteRemitente() {
        return listCienteRemitente;
    }

    public void setListCienteRemitente(List<Envio> listCienteRemitente) {
        this.listCienteRemitente = listCienteRemitente;
    }

    public List<Envio> getListClienteDestinatario() {
        return listClienteDestinatario;
    }

    public void setListClienteDestinatario(List<Envio> listClienteDestinatario) {
        this.listClienteDestinatario = listClienteDestinatario;
    }

    public Empresa getTheEmpresaDestinatario() {
        return theEmpresaDestinatario;
    }

    public void setTheEmpresaDestinatario(Empresa theEmpresaDestinatario) {
        this.theEmpresaDestinatario = theEmpresaDestinatario;
    }

    public Envio getTheEnvioDestinatario() {
        return theEnvioDestinatario;
    }

    public void setTheEnvioDestinatario(Envio theEnvioDestinatario) {
        this.theEnvioDestinatario = theEnvioDestinatario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
