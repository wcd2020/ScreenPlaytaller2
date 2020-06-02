package co.com.choucair.certification.tallerscreenplayclinica.model;

public class DatosDoctorPaciente {
    private String nombres;
    private String apellidos;
    private String telefono;
    private String tipoidentifacion;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoidentifacion() {
        return tipoidentifacion;
    }

    public String getTelefono() {
        return telefono;
    }

    private String numerodocumento;

    public String getNumerodocumento() {
        return numerodocumento;
    }
}
