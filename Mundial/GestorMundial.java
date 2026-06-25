
package Mundial;

import java.util.ArrayList;

public class GestorMundial{
    private ArrayList<participante> listaParticipantes;
    
    private Persistencia persistencia;
    private Reporte reporte;
    private Notificacion notificacion;
    
    public GestorMundial(Persistencia persistencia, Reporte reporte, Notificacion notificacion) {
        this.listaParticipantes = new ArrayList<>();
        this.persistencia = persistencia;
        this.reporte = reporte;
        this.notificacion = notificacion;
    }
    
    // Método 1: Agrega a la lista y notifica al instante
    public void registrarParticipante(participante p) {
        listaParticipantes.add(p);
        System.out.println("Registrado en el sistema: " + p.getNombre());
        notificacion.enviar("¡Has sido registrado en el Mundial!", p);
    }

    // Método 2: Pasa el ArrayList completo para que se guarde (Serialice)
    public void guardarInformacion() {
        if (!listaParticipantes.isEmpty()) {
            persistencia.guardar(listaParticipantes);
        } else {
            System.out.println("No hay participantes para guardar.");
        }
    }

    // Método 3: Pasa el ArrayList completo para generar el documento
    public void generarReporteGlobal() {
        if (!listaParticipantes.isEmpty()) {
            reporte.generar(listaParticipantes);
        } else {
            System.out.println("No hay participantes para el reporte.");
        }
    }
}

