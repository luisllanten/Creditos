package co.edu.ims.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genero implements Serializable {
    
    // Atrinutos
    @Id    
    private String nombre;
    private String descripcion;

    // Constructores
    public Genero() {
    }
    
    public Genero(String n, String d) {
        this.nombre = n;
        this.descripcion = d;
    }

    // Getters y setters...
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
}
