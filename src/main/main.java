
package main;

import classes.clsEstudiante;
import classes.clsNotas;

public class main {
    
    public static void main(String[] args) {
        
        clsEstudiante est1 = new clsEstudiante(2, "Nicolas","Barreto", "84375894", "20/10/2010");

        System.out.println("El estudiante " + est1.getNombre_Estudiante() + " saco 50");
        
    }
}
