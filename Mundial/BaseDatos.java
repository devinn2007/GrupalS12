
package Mundial;

import java.util.ArrayList;

public class BaseDatos implements Persistencia{
    @Override
    public void guardar(ArrayList<participante> participante) {
        System.out.println("Lista de Participantes guardado en la Base de Datos");
    }
}
