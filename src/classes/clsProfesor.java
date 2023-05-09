
package classes;

public class clsProfesor {
    private int ID;
    private String Nombre;
    private String Apellido;
    private String Num_Identificacion;
    private int Asignatura;

    public clsProfesor(int ID, String Nombre, String Apellido, String Num_Identificacion, int Asignatura) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Num_Identificacion = Num_Identificacion;
        this.Asignatura = Asignatura;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNum_Identificacion() {
        return Num_Identificacion;
    }

    public int getAsignatura() {
        return Asignatura;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNum_Identificacion(String Num_Identificacion) {
        this.Num_Identificacion = Num_Identificacion;
    }

    public void setAsignatura(int Asignatura) {
        this.Asignatura = Asignatura;
    }
    
    
}
