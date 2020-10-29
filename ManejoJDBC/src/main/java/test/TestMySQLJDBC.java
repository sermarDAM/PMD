/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sermar
 */
public class TestMySQLJDBC {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {  
           Connection conexion = DriverManager.getConnection(url,"root", "123456");
            Statement instruccion = conexion.createStatement();
            String sql="SELECT idpersona, nombre, apellido, edad FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            while (resultado.next()){
                System.out.println("Id Persona: " + resultado.getInt("idpersona"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Apellidos " + resultado.getString("apellidos"));
                System.out.println("Id Persona: " + resultado.getInt("edad"));
                
            resultado.close();
            conexion.close();
            instruccion.close();

            }
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
}
