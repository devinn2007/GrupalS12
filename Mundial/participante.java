
package Mundial;

import java.io.Serializable;

public abstract class participante implements Serializable{
    protected String nombre;
    protected String nacionalidad;
    protected String id;
    private static final long serialVersionUID = 1L;

    public participante(String nombre, String nacionalidad, String id) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public abstract void realizarActividad();
}
