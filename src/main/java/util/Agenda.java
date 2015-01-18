package util;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Carlos Coves Prieto <carlos.coves.prieto@gmail.com>
 */
@Named(value = "dao")
@ApplicationScoped
public class Agenda {

    private static List<Contacto> contactos;

    static {

        contactos = new LinkedList<>();
        Contacto per = new Contacto();
        per.setId(0);
        per.setNombre("Nombre" + 0);
        per.setDescripcion("Apellidos" + 0);
        per.setSex("H");
        per.setDireccion("aaa");
        per.setEdad(30);
        per.setFechaNacimeto(new Date());
        per.setTelefono("999-999-999");
        per.setEmail("aaa@aaa.com");
        per.setUrl("http://url" + 0 + ".com");
        contactos.add(per);

    }

    public static void addContacto(Contacto contacto) {
        contacto.setId(contactos.size());
        contactos.add(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactoList) {
        contactos = contactoList;
    }

    public void deleteContact(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void edit(Contacto contacto) {
        contactos.get(contactos.indexOf(contacto)).setEditable(true);
    }

    public void save() {
        for (Contacto contacto : contactos) {
            contacto.setEditable(false);
        }

    }

}
