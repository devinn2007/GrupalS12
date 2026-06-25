
package Mundial;

public class Entrenador extends participante{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String nacionalidad, String id) {
        super(nombre, nacionalidad, id);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
    @Override
    public void realizarActividad(){
        System.out.println("Panificando estrategias del partido");
    }
}
