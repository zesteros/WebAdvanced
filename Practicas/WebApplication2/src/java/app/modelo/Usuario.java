
package app.modelo;

/**
 *
 * @author MORUA
 */
public class Usuario {
    private int id;

    private String alias;

    private String nombre;

    private String contrasena;

    private String rol;

    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of rol
     *
     * @return the value of rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * Set the value of rol
     *
     * @param rol new value of rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Get the value of contrasena
     *
     * @return the value of contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Set the value of contrasena
     *
     * @param contrasena new value of contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of alias
     *
     * @return the value of alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Set the value of alias
     *
     * @param alias new value of alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

}

