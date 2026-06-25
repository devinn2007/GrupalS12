
package Mundial;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReportePDF implements Reporte {
    @Override
    public void generar(ArrayList<participante> participantes) {
        String nombreArchivo = "Reporte_Mundial.pdf";
        
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Encabezado del documento
            writer.write("==================================================\n");
            writer.write("        REPORTE OFICIAL - MUNDIAL DE FÚTBOL       \n");
            writer.write("==================================================\n\n");
            
            // Recorremos el ArrayList y damos formato de reporte
            for (participante p : participantes) {
                writer.write("ID de Registro : " + p.getId() + "\n");
                writer.write("Nombre         : " + p.getNombre() + "\n");
                writer.write("Nacionalidad   : " + p.getNacionalidad() + "\n");
                writer.write("--------------------------------------------------\n");
            }
            
            System.out.println("ÉXITO: Reporte PDF generado correctamente en '" + nombreArchivo + "'");
            
        } catch (IOException e) {
            System.out.println("ERROR al generar el PDF: " + e.getMessage());
        }
    }
}
