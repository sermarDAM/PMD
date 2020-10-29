/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.Conexion.getConnection;
import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author sermar
 */
public class PersonaDAO {
    private static final String SQL_select="SELECT idpersona, nombre, apellidos, edad FROM persona";
    
    public List<Persona> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        
        try{
            
            conn = getConnection();
            stm = conn.prepareStatement(SQL_select);
            rs = stm.executeQuery();
            while(rs.next()){
                int idPersona = rs.getInt("idPersona");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                int edad = rs.getInt("edad");
                persona = new Persona(idPersona, nombre, apellidos, edad);
                personas.add(persona);
            }
            
            
        } catch (SQLException ex){
            ex.printStackTrace(System.out);
        }
        finally{
            
            Conexion.close(conn);
            Conexion.close(rs);
            Conexion.close(stm);
            
        return personas;
        }
    }
}
