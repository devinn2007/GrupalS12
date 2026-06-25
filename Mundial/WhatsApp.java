
package Mundial;

public class WhatsApp implements Notificacion{
    @Override
    public void enviar(String mensaje, participante destinatario) {
        System.out.println("Enviando WhatsApp a " + destinatario.getNombre() + ": " + mensaje);
    }
}
