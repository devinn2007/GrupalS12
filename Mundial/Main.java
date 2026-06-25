
package Mundial;

public class Main {
    public static void main(String[] args) {
        // 1. Configuramos las herramientas
        // Usamos BaseDatos en lugar de Archivo para ver cómo procesa el ArrayList
        Persistencia persistenciaBD = new BaseDatos(); 
        Reporte reportePdf = new ReportePDF();
        Notificacion notificacionWhatsApp = new WhatsApp(); 

        // 2. Iniciamos el Gestor
        GestorMundial gestor = new GestorMundial(persistenciaBD, reportePdf, notificacionWhatsApp);

        // 3. Creamos las 3 clases hijas (Principio de Sustitución de Liskov)
        participante jugador = new Jugador("Delantero", "Lionel Messi","Argentina","99");
        participante entrenador = new Entrenador("Fuerte", "Lionel Scaloni", "Argentina", "9");
        participante arbitro = new Arbitro("Principal", "Pierluigi Collina", "Italia", "8");

        // 4. Registramos a todos (Se guardan en el ArrayList del Gestor)
        System.out.println("--- REGISTRO DE PARTICIPANTES ---");
        gestor.registrarParticipante(jugador);
        gestor.registrarParticipante(entrenador);
        gestor.registrarParticipante(arbitro);

        // 5. Procesamiento Masivo (El gestor le pasa el ArrayList a las interfaces)
        System.out.println("\n--- GENERANDO REPORTE MASIVO ---");
        gestor.generarReporteGlobal(); 
        
        // Aquí es donde entra en acción la clase BaseDatos que creamos arriba
        gestor.guardarInformacion(); 
    }
}
