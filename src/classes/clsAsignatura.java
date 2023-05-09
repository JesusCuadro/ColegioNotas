
package classes;

public class clsAsignatura {
    private int ID;
    private String Nombre;
    private String Nivel;
    private String Descripcion;

    public clsAsignatura(int ID, String Nombre, String Nivel, String Descripcion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Descripcion = Descripcion;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNivel() {
        return Nivel;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
