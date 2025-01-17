package pe.edu.upc.demorelaxup.dtos;

import pe.edu.upc.demorelaxup.entities.Usuario;
import pe.edu.upc.demorelaxup.entities.Foros;
import java.time.LocalDate;
public class MensajesForosDTO {
    private int idMensajesForos;
    private String contenido;
    private LocalDate fechaPublicacion;
    private Usuario usuario;
    private Foros foros;

    public int getIdMensajesForos() {
        return idMensajesForos;
    }

    public void setIdMensajesForos(int idMensajesForos) {
        this.idMensajesForos = idMensajesForos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Foros getForos() {
        return foros;
    }

    public void setForos(Foros foros) {
        this.foros = foros;
    }
}