
package classes;

public class clsNotas {
    private int ID;
    private int ID_Estudiante;
    private int ID_Asignatura;
    private int Nota;

    public clsNotas(int ID, int ID_Estudiante, int ID_Asignatura, int Nota) {
        this.ID = ID;
        this.ID_Estudiante = ID_Estudiante;
        this.ID_Asignatura = ID_Asignatura;
        this.Nota = Nota;
    }

    public int getID() {
        return ID;
    }

    public int getID_Estudiante() {
        return ID_Estudiante;
    }

    public int getID_Asignatura() {
        return ID_Asignatura;
    }

    public int getNota() {
        return Nota;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setID_Estudiante(int ID_Estudiante) {
        this.ID_Estudiante = ID_Estudiante;
    }

    public void setID_Asignatura(int ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }
    
    
}
