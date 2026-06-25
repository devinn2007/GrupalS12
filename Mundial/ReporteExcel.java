
package Mundial;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ReporteExcel implements Reporte {
    @Override
    public void generar(ArrayList<participante> participantes) {
        String nombreArchivo = "Reporte_Mundial.csv";
        
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // 1. Escribimos los encabezados de las columnas para Excel
            writer.write("ID,Nombre,Nacionalidad,\n");
            
            // 2. Recorremos el ArrayList y escribimos fila por fila
            for (participante p : participantes) {
                writer.write(p.getId() + "," 
                           + p.getNombre() + "," 
                           + p.getNacionalidad() + "," + "\n");
            }
            
            System.out.println("EXITO: Reporte Excel generado correctamente en '" + nombreArchivo + "'");
            
        } catch (IOException e) {
            System.out.println("ERROR al generar el Excel: " + e.getMessage());
        }
    }
}
