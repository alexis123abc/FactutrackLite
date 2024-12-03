/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.UsuarioBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DERICK ALEXIS
 */
public class UsuariosDAO {
   /*
        public Vector listando_Usuarios() throws Exception {
        Vector lista = new Vector();
        String consultaSql = "SELECT id, nombre_usuario, contrasena FROM categoria";

    try (Connection establecerConexion = ConexionSQL.getConexion();
         Statement prepararConsulta = establecerConexion.createStatement();
         ResultSet rs = prepararConsulta.executeQuery(consultaSql)) {

        while (rs.next()) {
            UsuarioBeans nuevoObjeto = new UsuarioBeans();
            nuevoObjeto.setId(rs.getInt("id"));
            nuevoObjeto.setNombreUsuario(rs.getString("nombre_usuario"));
            nuevoObjeto.setContrasena(rs.getString("contrasena"));
            lista.add(nuevoObjeto);
        }
    } catch (SQLException e) {
        throw new Exception("Error al listar categorías: " + e.getMessage(), e);
    }
    return lista;
    }
   */
    
     public boolean encontrarUsuario (String usuario,  String contrasena){
        
        ConexionSQL conetarBD = new ConexionSQL();
        Connection nuevaconexion = conetarBD.getConexion();
        String consultaUsuarioContraseña = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
           
        try {
            PreparedStatement ps = nuevaconexion.prepareStatement(consultaUsuarioContraseña);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            
            ResultSet resultadoTabla = ps.executeQuery();
            
            if(resultadoTabla.next()){
                 return true;
            } else {
                return false;
                }
                
            } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Error en la conexion: " + e.getMessage());
        } finally{
            ConexionSQL.closeConnection();
        }
        return false;
     }
}


