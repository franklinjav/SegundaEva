package src.main.java.Eje4;

public class GestorContactos {
    //Métodos

    public static void modificarTelefonos(Contacto contacto, String telefono) {
        contacto.setNumero(telefono);
    }
    public static void modificarCorreo(Contacto contacto, String correo) {
        contacto.getTitular().setCorreo(correo);
    }
    public static boolean compararContactos(Contacto contacto1, Contacto contacto2) {
        return contacto1.getNumero().equals(contacto2.getNumero());
    }
}
