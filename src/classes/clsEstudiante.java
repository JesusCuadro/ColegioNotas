
package classes;


public class clsEstudiante {
    private int ID;
    private String Nombre_Estudiante;
    private String Apellido_Estudiante;
    private String Numero_Identificacion;
    private String Fec_Nacimiento;

    public clsEstudiante(int ID, String Nombre_Estudiante, String Apellido_Estudiante, String Numero_Identificacion, String Fec_Nacimiento) {
        this.ID = ID;
        this.Nombre_Estudiante = Nombre_Estudiante;
        this.Apellido_Estudiante = Apellido_Estudiante;
        this.Numero_Identificacion = Numero_Identificacion;
        this.Fec_Nacimiento = Fec_Nacimiento;
    }

    public int getID() {
        return ID;
    }

    public String getNombre_Estudiante() {
        return Nombre_Estudiante;
    }

    public String getApellido_Estudiante() {
        return Apellido_Estudiante;
    }

    public String getNumero_Identificacion() {
        return Numero_Identificacion;
    }

    public String getFec_Nacimiento() {
        return Fec_Nacimiento;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre_Estudiante(String Nombre_Estudiante) {
        this.Nombre_Estudiante = Nombre_Estudiante;
    }

    public void setApellido_Estudiante(String Apellido_Estudiante) {
        this.Apellido_Estudiante = Apellido_Estudiante;
    }

    public void setNumero_Identificacion(String Numero_Identificacion) {
        this.Numero_Identificacion = Numero_Identificacion;
    }

    public void setFec_Nacimiento(String Fec_Nacimiento) {
        this.Fec_Nacimiento = Fec_Nacimiento;
    }
    
    
}
