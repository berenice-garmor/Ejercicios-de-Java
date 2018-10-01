/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.kanter;
import java.sql.*;

/*import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/




/**
 *
 * @author Hp
 */
public class TestKanter {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here
        
 //si se usa esta forma se le tiene que poner connect() a un lado del public void
/*String url = "jdbc:mysql://localhost:3306/test";
String user = "root";
String pass = "";
System.out.println("Conectando...");
try(java.sql.Connection connection = DriverManager.getConnection(url, user,pass)){
System.out.println("Conectado!!");
 
}catch(SQLException e){
System.out.println(e.getMessage());*/


        try
        {  
        Class.forName("com.mysql.jdbc.Driver");  //este siempre tiene que estar
        Connection conn=DriverManager.getConnection( 
        "jdbc:mysql://localhost:3306/test?" +"user=root" +"password="); 
        /*local host (tambien pude venir como 127.0.0.1)
        el 3306 es el puerto, test es el nombre de la BD
        user=root & password= " " nada
        */
        
        PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select * from alumnos"); 
        
        ResultSet rs= (ResultSet) pst.executeQuery();
        
        if (rs.next())
            System.out.println("Si se logro la conexion");
        
        else
            System.out.println("No se logro la conexion");
        
        }
        
        catch(Exception e)
        { 
            e.printStackTrace();
        }  
}  


}

    
