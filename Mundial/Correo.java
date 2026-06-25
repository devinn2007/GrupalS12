
package Mundial;

public class Correo implements Notificacion{
    @Override
    public void enviar(String mensaje, participante destinatario) {
        System.out.println("Enviando Correo a " + destinatario.getNombre() + ": " + mensaje);
    }
}
