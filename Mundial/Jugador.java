
package Mundial;

public class Jugador extends participante{
    private String poscicion;

    public Jugador(String poscicion, String nombre, String nacionalidad, String id) {
        super(nombre, nacionalidad, id);
        this.poscicion = poscicion;
    }

    public String getPoscicion() {
        return poscicion;
    }

    public void setPoscicion(String poscicion) {
        this.poscicion = poscicion;
    }
    
    @Override
    public void realizarActividad(){
        System.out.println("Entrenando disparos al arco");
    }
}
