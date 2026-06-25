
package Mundial;

public class Arbitro extends participante{
    private String categoria;

    public Arbitro(String categoria, String nombre, String nacionalidad, String id) {
        super(nombre, nacionalidad, id);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void realizarActividad(){
        System.out.println("Supervisando reglas del encuentro");
    }
}
