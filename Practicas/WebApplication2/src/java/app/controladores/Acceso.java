
package app.controladores;
import app.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MORUA
 */

    @Named(value = "acceso")
    @SessionScoped
public class Acceso extends Usuario implements Serializable {

    private String mensaje;

    /**
     * Get the value of mensaje
     *
     * @return the value of mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Set the value of mensaje
     *
     * @param mensaje new value of mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private ArrayList<Usuario> usuarios;

    /**
     * Get the value of usuarios
     *
     * @return the value of usuarios
     */
    public ArrayList getUsuarios() {
        return usuarios;
    }

    /**
     * Set the value of usuarios
     *
     * @param usuarios new value of usuarios
     */
    public void setUsuarios(ArrayList usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Creates a new instance of Acceso
     */
    public Acceso() {
        usuarios = new ArrayList();
        //----Poblar la lista
        Usuario u = new Usuario();
        u.setId(0);
        u.setAlias("admin");
        u.setContrasena("12345");
        u.setNombre("Administrador");
        u.setRol("administrador");
        u.setEmail("admi69@hotmail.com");

        usuarios.add(u);

        u = new Usuario();
        u.setId(1);
        u.setAlias("angelo");
        u.setContrasena("12345");
        u.setNombre("Angelo loza");
        u.setRol("usuario");
        u.setEmail("angeloloza@itleon.edu.mx");

        usuarios.add(u);
    }

    public String valida() {
        Usuario u = null;
        // Buscar usuario
        for (int i = 0; i < usuarios.size(); i++) {
            u = usuarios.get(i);
            if (u.getAlias().equals(this.getAlias())
                    && u.getContrasena().equals(this.getContrasena())) {
                // Usuario encontrado
                // Cual es el rol ?
                this.setNombre(u.getNombre());
                this.setEmail(u.getEmail());
                if (u.getRol().equals("administrador")) {
                    return "menuadmistrador";
                } else {
                    return "menuusuario";
                }

            }

        }
        mensaje = "Usuario o contraseña invalido";
        return "index";
    }
}

    

