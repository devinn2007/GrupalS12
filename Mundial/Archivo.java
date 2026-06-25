
package Mundial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo implements Persistencia{
    @Override
    public void guardar(ArrayList<participante> participantes) {
        // Se crea un unico archivo con todos los datos
        try (FileOutputStream fileOut = new FileOutputStream("Datos_Mundial.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(participantes);
            System.out.println("ÉXITO: ArrayList serializado en 'Datos_Mundial.dat'");
            
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }
    }
}
