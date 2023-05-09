
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class conexion {
    
    Connection con;

    public conexion(){
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/colegio","root",""); 
        ResultSet resultados = sentencia.executeQuery("SELECT * FROM estudiante");
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setInt(1, ID);
    
    while (resultados.next()) {
        int ID = resultados.getInt("ID");
        String Nombre = resultados.getString("Nombre");
        String Apellido = resultados.getString("Apellido");
        String Num_Identificacion = resultados.getString("Num. Identificacion");
        String Fec_Nacimiento = resultados.getString("Fec. Nacimiento");
        
        System.out.println(ID + Nombre + Apellido + Num_Identificacion + Fec_Nacimiento);
    }
        
     } catch(ClassNotFoundException | SQLException e){
     }
     
 } 
   
    public Connection getConnection(){
        return con;
    }
    
    public boolean verificarConexion(){
    try{
        return !con.isClosed();
    } catch(SQLException e){
        return false;
    }
}
    
    public static void main(String[] args) {
        conexion conex = new conexion();
        if(conex.verificarConexion()){
            System.out.println("La conexion es correcta");
        } else {
            System.out.println("La conexion no es correcta");
        }
    }
    
}
